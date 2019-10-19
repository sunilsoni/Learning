package com.learning.spring.annotation.autowired.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FooService {
     
    @Autowired
    private FooFormatter fooFormatter;
 
}