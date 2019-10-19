package com.learning.spring.annotation.autowired.Qualifier;

import org.springframework.stereotype.Component;

@Component("fooFormatter5")
public class FooFormatter5 implements Formatter5 {

    public String format() {
        return "foo";
    }
}