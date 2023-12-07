package com.rachel.springframework.context;

public interface ApplicationEventPublisher {

    void publishEvent(ApplicationEvent event);

}
