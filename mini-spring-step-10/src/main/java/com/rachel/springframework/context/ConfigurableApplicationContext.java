package com.rachel.springframework.context;

import com.rachel.springframework.beans.BeansException;

public interface ConfigurableApplicationContext extends ApplicationContext {

    void refresh() throws BeansException;

    /**
     * 注册虚拟机钩子
     */
    void registerShutdownHook();


    /**
     * 关闭
     */
    void close();
}
