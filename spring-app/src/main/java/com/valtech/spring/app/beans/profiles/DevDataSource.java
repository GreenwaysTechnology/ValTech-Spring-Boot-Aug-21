package com.valtech.spring.app.beans.profiles;

import org.springframework.stereotype.Component;

@Component
public class DevDataSource {
    public DevDataSource() {
        System.out.println("Dev Data Source");
    }

    public String getDevDataSource(){
        return "Dev Data Source";
    }

}
