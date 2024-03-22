package com.sunfj;

import com.sunfj.listener.TestApplicationListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.sunfj.dao")
public class SpringBootStarterMain {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringBootStarterMain.class);
        springApplication.addListeners(new TestApplicationListener());
        springApplication.run(args);
    }
}
