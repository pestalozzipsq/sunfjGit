package com.sunfj.config;

import lombok.Getter;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ServerConfig implements ApplicationListener<WebServerInitializedEvent> {

    private Integer port;
    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        int port = event.getWebServer().getPort();
        this.port = port;
    }
}
