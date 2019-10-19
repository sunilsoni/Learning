package com.learning.spring.bean.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IoCInAction {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Company company = context.getBean("company", Company.class);

        System.out.println("getStreet: "+company.getAddress().getStreet());

        System.out.println("getNumber:  "+company.getAddress().getNumber());
    }
}
