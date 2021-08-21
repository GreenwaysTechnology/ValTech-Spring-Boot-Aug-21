package com.example.loggingapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LoggingappApplication {
    static final Logger log = LoggerFactory.getLogger(LoggingappApplication.class);

    public static void main(String[] args) {
        log.info("Before Starting application");
        SpringApplication.run(LoggingappApplication.class, args);
        log.debug("Starting my application in debug with {} args", args.length);
        log.info("Starting my application with {} args.", args.length);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        log.info("hello called");
        log.debug("hello debug is called");
        return "Hello";
    }

}
