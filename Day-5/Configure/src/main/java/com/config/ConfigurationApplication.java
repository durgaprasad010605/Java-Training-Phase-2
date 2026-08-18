package com.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Configuration
@ComponentScan("com.config")
public class ConfigurationApplication{

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        BankAccount account = context.getBean(BankAccount.class);

        account.displayAccount();
    }
}