package com.learning.spring.annotation.autowired.Setters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FooService2 {

    private FooFormatter2 fooFormatter2;

    @Autowired
    public void setFooFormatter(FooFormatter2 fooFormatter2) {
        this.fooFormatter2 = fooFormatter2;
    }
}