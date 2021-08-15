package com.valtech.spring.app.beans.profiles;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.xml.transform.Source;

@Configuration
//@EnableCaching
public class DataSourceConfig {

    @Bean
    @Profile("dev")
    public DevDataSource createDevDataSource(){
        return new DevDataSource();
    }
    @Bean
    @Profile("prod")
    public ProdDataSource createProdDataSource(){
        return new ProdDataSource();
    }
}
