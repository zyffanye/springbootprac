package com.demo;

import com.demo.listener.MyApplicationStartedEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootpracApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringbootpracApplication.class);
        app.addListeners(new MyApplicationStartedEventListener());
        SpringApplication.run(SpringbootpracApplication.class, args);
    }

}
