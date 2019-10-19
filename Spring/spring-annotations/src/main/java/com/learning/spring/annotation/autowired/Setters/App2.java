package com.learning.spring.annotation.autowired.Setters;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class App2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig2.class);
        FooService2 fooService = ctx.getBean(FooService2.class);

        log.info("fooService: {}",fooService);

    }
}
