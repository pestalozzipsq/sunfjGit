package com.sunfj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RibbenConsumer8901Application {
    public static void main(String[] args) {
        SpringApplication.run(RibbenConsumer8901Application.class);
    }
}
