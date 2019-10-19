package com.learning.spring.annotation.autowired.CustomQualifier;

import com.learning.spring.annotation.autowired.Qualifier.Formatter5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class FooService6 {

    @Autowired
    @FormatterType("Foo")
    private Formatter6 formatter6;

}