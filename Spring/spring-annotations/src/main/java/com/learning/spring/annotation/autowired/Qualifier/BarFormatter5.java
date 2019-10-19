package com.learning.spring.annotation.autowired.Qualifier;

import org.springframework.stereotype.Component;

@Component("barFormatter5")
public class BarFormatter5 implements Formatter5 {
 
    public String format() {
        return "bar";
    }
}