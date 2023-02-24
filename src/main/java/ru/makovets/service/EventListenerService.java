package ru.makovets.service;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerService {

    @EventListener(WebServerInitializedEvent.class)
    public void systemStarted() {
        System.out.println("Application started.");
    }
}
