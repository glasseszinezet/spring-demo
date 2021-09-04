package com.devproxy.instaant;

import com.devproxy.instaant.models.users.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = context.getBean("user",User.class);


        System.out.println("greeting:\t"+user.getGreetingMessage());
        System.out.println("password hash:\t"+ user.getPasswordHash());

        context.close();
    }
}
