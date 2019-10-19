package com.learning.spring.annotation.autowired.Properties;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class App1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig1.class);
        FooService fooService = ctx.getBean(FooService.class);

        log.info("fooService: {}",fooService);

    }
}
