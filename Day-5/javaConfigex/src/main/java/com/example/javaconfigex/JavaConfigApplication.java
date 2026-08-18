package com.example.javaconfigex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Configuration
@ComponentScan("com.example.javaconfigex")
public class JavaConfigApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfigApplication.class);

        BankAccount account =
                context.getBean(BankAccount.class);

        account.displayAccount();
    }
}