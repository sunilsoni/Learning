package com.learning.spring.annotation.autowired.Constructors;

import org.springframework.stereotype.Component;

@Component("fooFormatter")
public class FooFormatter3 {
 
    public String format() {
        return "foo";
    }
}