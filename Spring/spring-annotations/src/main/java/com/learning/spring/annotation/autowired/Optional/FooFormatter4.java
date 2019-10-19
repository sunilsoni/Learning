package com.learning.spring.annotation.autowired.Optional;

import org.springframework.stereotype.Component;

@Component("fooFormatter")
public class FooFormatter4 {
 
    public String format() {
        return "foo";
    }
}