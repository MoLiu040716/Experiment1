package com.example.eureka_server_20001;

import com.netflix.discovery.EurekaNamespace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer20001Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer20001Application.class, args);
    }

}
