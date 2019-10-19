package com.learning.spring.annotation.autowired.Name;

import com.learning.spring.annotation.autowired.CustomQualifier.AppConfig6;
import com.learning.spring.annotation.autowired.CustomQualifier.FooService6;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class App7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig6.class);

        FooService6 fooService = ctx.getBean(FooService6.class);
        log.info("fooService: {}",fooService);

    }
}
