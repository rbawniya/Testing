package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class BeanScop {

    @Bean
    @Scope(scopeName = "singleton")
    public BeanClass beanClass() {
        return new BeanClass();
    }

    @Bean
    @Scope(scopeName = "prototype")
    public BeanClass beanClass1() {
        return new BeanClass();
    }

    @Bean
    @Scope(scopeName = "request")
    public BeanClass beanClass2() {
        return new BeanClass();
    }

    @Bean
    @Scope(scopeName = "session")
    public BeanClass beanClass3() {
        return new BeanClass();
    }
}

class BeanClass {
    private int id;
}
