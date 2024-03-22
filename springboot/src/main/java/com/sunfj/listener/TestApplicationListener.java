package com.sunfj.listener;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

@Component
public class TestApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ApplicationStartingEvent) {
            System.out.println("starting=========================================");
        }
        else if (event instanceof ApplicationEnvironmentPreparedEvent) {
            System.out.println("EnvironmentPrepared=========================================");
        }
        else if (event instanceof ApplicationPreparedEvent) {
            System.out.println("Prepared=========================================");
        }
        else if (event instanceof ContextClosedEvent && ((ContextClosedEvent) event)
                .getApplicationContext().getParent() == null) {
            System.out.println("ContextClosed=========================================");
        }
        else if (event instanceof ApplicationFailedEvent) {
            System.out.println("Failed=========================================");
        }

    }
}
