package com.learning.spring.annotation.autowired.CustomQualifier;

import org.springframework.stereotype.Component;

@FormatterType("Bar")
@Component
public class BarFormatter6 implements Formatter6 {
 
    public String format() {
        return "bar";
    }
}