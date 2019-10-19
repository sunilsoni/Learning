package com.learning.spring.annotation.autowired.Properties;

import org.springframework.stereotype.Component;

@Component("fooFormatter")
public class FooFormatter {
 
    public String format() {
        return "foo";
    }
}