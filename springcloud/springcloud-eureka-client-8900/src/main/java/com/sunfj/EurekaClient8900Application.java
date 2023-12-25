package com.sunfj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
// 开启EnableWebSecurity组件
public class EurekaClient8900Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClient8900Application.class);
    }
}
