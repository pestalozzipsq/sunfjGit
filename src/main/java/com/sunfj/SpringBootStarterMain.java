package com.sunfj;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;


@SpringBootApplication
public class SpringBootStarterMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootStarterMain.class, args);
        Environment env = run.getEnvironment();
        String xmxValue = env.getProperty("java.vm.options");
        System.out.println("Xmx value: " + xmxValue);
    }
}
