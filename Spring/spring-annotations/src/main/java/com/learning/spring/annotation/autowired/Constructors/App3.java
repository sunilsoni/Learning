package com.learning.spring.annotation.autowired.Constructors;

import com.learning.spring.annotation.autowired.Setters.AppConfig2;
import com.learning.spring.annotation.autowired.Setters.FooService2;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class App3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig3.class);
        FooService3 fooService = ctx.getBean(FooService3.class);

        log.info("fooService: {}",fooService);

    }
}
