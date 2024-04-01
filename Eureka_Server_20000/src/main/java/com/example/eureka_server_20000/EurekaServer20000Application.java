package com.example.eureka_server_20000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer20000Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer20000Application.class, args);
    }

}
