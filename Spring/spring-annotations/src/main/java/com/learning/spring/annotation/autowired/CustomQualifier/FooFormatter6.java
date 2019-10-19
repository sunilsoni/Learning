package com.learning.spring.annotation.autowired.CustomQualifier;

import org.springframework.stereotype.Component;

@FormatterType("Foo")
@Component
public class FooFormatter6 implements Formatter6 {
 
    public String format() {
        return "foo";
    }
}