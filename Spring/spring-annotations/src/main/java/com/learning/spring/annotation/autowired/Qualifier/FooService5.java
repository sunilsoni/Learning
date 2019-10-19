package com.learning.spring.annotation.autowired.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class FooService5 {

    @Autowired
    @Qualifier("fooFormatter5")
    private Formatter5 formatter;

}