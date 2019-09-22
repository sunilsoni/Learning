package com.training.stub;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CustomerReader {

    private DbManager mDbManager;

    public CustomerReader(DbManager dbManager) {
        this.mDbManager = dbManager;
    }

    public String findName(Long customerID) {
        Customer customer = mDbManager.findCustomer(customerID);
        return customer.getFirstName() + " " + customer.getLastName();
    }
}
