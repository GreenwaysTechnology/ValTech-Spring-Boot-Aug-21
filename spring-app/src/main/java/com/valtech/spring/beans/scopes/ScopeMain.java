package com.valtech.spring.beans.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeMain {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        ClientService clientService = null;
        clientService = factory.getBean("clientService", ClientService.class);
        System.out.println(clientService.hashCode());

        clientService = factory.getBean("clientService", ClientService.class);
        System.out.println(clientService.hashCode());

        clientService = factory.getBean("clientService", ClientService.class);
        System.out.println(clientService.hashCode());

    }
}
