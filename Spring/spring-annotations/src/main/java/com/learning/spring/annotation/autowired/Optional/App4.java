package com.learning.spring.annotation.autowired.Optional;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class App4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig4.class);
        FooService4 fooService = ctx.getBean(FooService4.class);

        log.info("fooService: {}",fooService);

    }
}
