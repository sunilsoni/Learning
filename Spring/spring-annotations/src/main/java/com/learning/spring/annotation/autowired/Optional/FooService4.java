package com.learning.spring.annotation.autowired.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FooService4 {

    @Autowired(required = false)
    private FooDAO dataAccessor;
}