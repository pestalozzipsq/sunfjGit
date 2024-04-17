package com.sunfj.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "test")
@Component
public class TestArgConfig {
    private String homeDir;


    public String getHomeDir() {
        System.out.println("===================homeDir : "+homeDir);
        return homeDir;

    }

    public void setHomeDir(String homeDir) {
        this.homeDir = homeDir;
        System.out.println("===================homeDir : "+homeDir);
    }
}
