package com.learning.spring.annotation.autowired.CustomQualifier;

import com.learning.spring.annotation.autowired.Qualifier.AppConfig5;
import com.learning.spring.annotation.autowired.Qualifier.FooService5;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Log4j2
public class App6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig6.class);

        FooService6 fooService = ctx.getBean(FooService6.class);
        log.info("fooService: {}",fooService);

    }
}



