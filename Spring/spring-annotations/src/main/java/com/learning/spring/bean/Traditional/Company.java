package com.learning.spring.bean.Traditional;

import lombok.Data;

@Data
public class Company {
    private Address address;
 
    public Company(Address address) {
        this.address = address;
    }

}