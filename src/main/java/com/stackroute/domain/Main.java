package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Config file loaded.");
        actor actor = context.getBean(actor.class);
        movie movie = context.getBean(movie.class);
        movie.displayDetails(actor);
    }
}
