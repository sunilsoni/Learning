package com.learning.spring.annotation.autowired.Qualifier;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class App5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig5.class);
        FooService5 fooService = ctx.getBean(FooService5.class);

        log.info("fooService: {}",fooService);

    }
}
