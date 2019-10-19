package com.learning.spring.annotation.autowired.Setters;

import org.springframework.stereotype.Component;

@Component("fooFormatter")
public class FooFormatter2 {
 
    public String format() {
        return "foo";
    }
}