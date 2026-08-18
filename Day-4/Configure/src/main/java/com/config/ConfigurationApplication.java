package com.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationApplication {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        BankAccount account = context.getBean(BankAccount.class);

        account.disaccount();
    }
}