package com.training.mock;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
public class LateInvoiceNotifier {

    private static final String NAME = "Susan Ivanova";
    private final EmailSender emailSender;
    private final InvoiceStorage invoiceStorage;
    private final EventRecorder eventRecorder;

    public LateInvoiceNotifier(final EmailSender emailSender, final InvoiceStorage invoiceStorage, EventRecorder eventRecorder) {
        this.emailSender = emailSender;
        this.invoiceStorage = invoiceStorage;
        this.eventRecorder = eventRecorder;
    }

    public void notifyLate(Customer customer) {
        if (invoiceStorage.hasOutstandingInvoice(customer)) {
            eventRecorder.recordEvent(new Event(Event.Type.REMINDER_SENT, NAME, LocalDate.now()));
            emailSender.sendEmail(customer);
        }
    }
}
