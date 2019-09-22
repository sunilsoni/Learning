package com.training.async.db;


import com.training.mock.Customer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CustomerDaoTest {

    public static final String JOHN = "John";
    public static final String DOUVER = "Douver";

    @Mock
    EntityManager entityManagerMock;

    @Mock
    Logger loggerMock;

    private CustomerDao customerDao;

    @Before
    public void setup() throws Exception {
        customerDao = new CustomerDao(entityManagerMock,loggerMock);
    }

    @Test
    public void dao_whenCustomerSaved_returnedCustomerId() {

        //arrange
        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                Customer customer = (Customer) invocation.getArguments()[0];
                customer.setId(123L);
                return null;
            }
        }).when(entityManagerMock).persist(any(Customer.class));

        //action
        customerDao.saveCustomer(JOHN, DOUVER);

        //assert
        verify(loggerMock).info("Saved customer with id {}", 123L);

    }
}