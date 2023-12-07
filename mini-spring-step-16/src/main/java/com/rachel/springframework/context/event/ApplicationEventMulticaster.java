package com.rachel.springframework.context.event;


import com.rachel.springframework.context.ApplicationEvent;
import com.rachel.springframework.context.ApplicationListener;


/**
 * 事件广播器
 */
public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);


}
