package com.training;

import com.training.mock.Customer;

public class Fixtures {

    public Customer getCustomerObject(){
       return Customer.builder().firstName("ABV").id(1).lastName("XYS").build();
    }
}
