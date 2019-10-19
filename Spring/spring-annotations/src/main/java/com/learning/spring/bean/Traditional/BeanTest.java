package com.learning.spring.bean.Traditional;

public class BeanTest {
    public static void main(String[] args) {
        Address address = new Address("High Street", 1000);
        Company company = new Company(address);

        System.out.println("getStreet: "+company.getAddress().getStreet());

        System.out.println("getNumber:  "+company.getAddress().getNumber());

    }
}
