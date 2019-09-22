package com.training.mock;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LateInvoiceNotifierTest {

    //region helper fields
    private Customer sampleCustomer;

    @Mock
    EmailSender mEmailSenderMock;

    @Mock
    InvoiceStorage mInvoiceStorageMock;

    @Mock
    EventRecorder mEventRecorderMock;
    //endregion helper fields

    //Class to be tested
    LateInvoiceNotifier lateInvoiceNotifier;

    @Before
    public void setup() throws Exception {

        lateInvoiceNotifier = new LateInvoiceNotifier(mEmailSenderMock, mInvoiceStorageMock, mEventRecorderMock);

        //set once and used by all methods
        sampleCustomer = new Customer();
        sampleCustomer.setFirstName("Harie");
        sampleCustomer.setLastName("Kane");


    }

    @Test
    public void notifier_foundLateInvoice_emailSendSuccess() throws Exception{

        //arrange
        //by stubbing we can return the value that will be true or false
        when(mInvoiceStorageMock.hasOutstandingInvoice(sampleCustomer)).thenReturn(true);

        //action
        lateInvoiceNotifier.notifyLate(sampleCustomer);

        //assert
        verify(mEmailSenderMock).sendEmail(sampleCustomer);

    }

    @Test
    public void notifier_noLateInvoice_emailSendFailed() {

        //arrange
        when(mInvoiceStorageMock.hasOutstandingInvoice(sampleCustomer)).thenReturn(false);

        //action
        lateInvoiceNotifier.notifyLate(sampleCustomer);


        //assert
        verify(mEmailSenderMock, times(0)).sendEmail(sampleCustomer);

    }

    @Test
    public void notifier_foundLateInvoice_eventWithAC() {

        //arrange
        ArgumentCaptor<Event> myCaptor = ArgumentCaptor.forClass(Event.class);
        when(mInvoiceStorageMock.hasOutstandingInvoice(sampleCustomer)).thenReturn(true);

        //action
        lateInvoiceNotifier.notifyLate(sampleCustomer);

        //assert
        verify(mEmailSenderMock).sendEmail(sampleCustomer);

        verify(mEventRecorderMock).recordEvent(myCaptor.capture());

        Event eventThatWasSent = myCaptor.getValue();
        assertNotNull(eventThatWasSent.getTimestamp());
        assertEquals(Event.Type.REMINDER_SENT, eventThatWasSent.getType());
        assertEquals("Susan Ivanova",eventThatWasSent.getCustomerName());
    }

}