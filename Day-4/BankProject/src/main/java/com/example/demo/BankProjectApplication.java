package com.example.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankProjectApplication {

    public static void main(String[] args) {

        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");

        BankAccount account = context.getBean("account", BankAccount.class);

        account.disaccount();
    
        
    }
    
}
