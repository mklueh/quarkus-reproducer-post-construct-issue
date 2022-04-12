package com.example.reproducer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;

/**
 * Created by Marian at 12.04.2022
 */
@ApplicationScoped
public class Test {

    @PostConstruct
    public void test() {
        System.out.println("construct");
    }

    @PreDestroy
    public void test2() {
        System.out.println("destroy");
    }
}
