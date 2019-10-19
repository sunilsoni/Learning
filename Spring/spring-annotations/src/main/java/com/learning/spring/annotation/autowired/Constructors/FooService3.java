package com.learning.spring.annotation.autowired.Constructors;

import com.learning.spring.annotation.autowired.Setters.FooFormatter2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FooService3 {

    private FooFormatter3 fooFormatter;

    @Autowired
    public FooService3(FooFormatter3 fooFormatter) {
        this.fooFormatter = fooFormatter;
    }
}