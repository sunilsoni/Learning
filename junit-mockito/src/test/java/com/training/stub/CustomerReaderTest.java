package com.training.stub;

import lombok.extern.slf4j.Slf4j;
import org.junit.*;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@Slf4j
@RunWith(MockitoJUnitRunner.class)
public class CustomerReaderTest {

    private static final long CUSTOMER_ID = 1L;
    private static final String CUSTOMER_NAME = "Customer Name";
    public static final String FIRST_NAME = "Customer";
    public static final String LAST_NAME = "Name";

    @Mock
    DbManager dbManagerMock;


    CustomerReader customerReader;

    @Before
    public void setup() throws Exception {
        log.info("Starting Setup method...");
        customerReader = new CustomerReader(dbManagerMock);
    }

    @After
    public void destroy() throws Exception {
        log.info("Starting destroy...");
        customerReader = null;
    }


    @BeforeClass
    public static void init() throws Exception {
        log.info("Starting init ...");
     }

    @AfterClass
    public static void initDestroy() throws Exception {
        log.info("Starting initDestroy ...");
    }

    @Test
    public void test_customerIdPassed_nameReturned() {
        log.info("Starting test_customerIdPassed_nameReturned ...");
        //arrange
        Customer customer = new Customer();
        customer.setFirstName(FIRST_NAME);
        customer.setLastName(LAST_NAME);

        when(dbManagerMock.findCustomer(CUSTOMER_ID)).thenReturn(customer);
        //action
        String name = customerReader.findName(CUSTOMER_ID);
        //assert
        assertThat(name, is(equalTo(CUSTOMER_NAME)));
        log.info("Ending test_customerIdPassed_nameReturned ...");
    }


    @Test
    public void method2() {
        log.info("Starting and ending method2 ...");
    }
}