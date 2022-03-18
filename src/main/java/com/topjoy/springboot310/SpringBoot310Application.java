package com.topjoy.springboot310;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBoot310Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot310Application.class, args);
    }

}
