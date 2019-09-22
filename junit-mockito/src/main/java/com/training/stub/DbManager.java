package com.training.stub;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class DbManager {

    public static final String FIRST_NAME = "Customer";
    public static final String LAST_NAME = "Name";

    public Customer findCustomer(Long customerId) {
        Customer customer = null;
        if (customerId > 0) {
            customer = new Customer();
            customer.setId(customerId);
            customer.setFirstName(FIRST_NAME);
            customer.setLastName(LAST_NAME);
        }
        return customer;
    }
}
