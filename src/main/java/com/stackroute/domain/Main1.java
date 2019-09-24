package com.stackroute.domain;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main1 {
    public static void main(String[] args) {

        XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("beans.xml"));
        System.out.println("Config file loaded.");
        actor obj1 = (actor) factory.getBean("actor");
        movie obj = (movie) factory.getBean("movie");
        obj.displayDetails(obj1);
        System.out.println("branch");
        System.out.println("new branch");
    }
}
