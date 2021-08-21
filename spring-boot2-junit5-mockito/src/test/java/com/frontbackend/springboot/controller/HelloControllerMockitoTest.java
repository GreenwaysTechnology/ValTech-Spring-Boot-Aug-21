package com.frontbackend.springboot.controller;

import com.frontbackend.springboot.service.HelloService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class HelloControllerMockitoTest {

    @Mock
    private HelloService helloService;

    @InjectMocks
    private HelloController helloController;

    @BeforeEach
    void setMockOutput() {
        //which is eq == calling api from browser or post man -  GET  /
        //We are defining rule that if i call HelloService getWelcomeMessage, should return "Hello"
        when(helloService.getWelcomeMessage()).thenReturn("Hello Mockito Test");
        System.out.println(helloService.getWelcomeMessage());
        when(helloService.getHaiMessage()).thenReturn("Hai");
    }

    @Test
    public void shouldReturnDefaultMessage() {
        String response = helloController.greeting();
        assertThat(response).isEqualTo("Hello Mockito Test");
    }

    @Test
    public void shouldReturnHaiMessage() {
      String response = helloController.hai();
      assertThat(response).isEqualTo("hi");
    }
}
