package com.valtech.bootapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitDb implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("code here is called before container ready to access");
    }
}
