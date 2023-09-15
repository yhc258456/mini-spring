package com.rachel.springframework.context;

import com.rachel.springframework.beans.BeansException;
import com.rachel.springframework.beans.factory.ListableBeanFactory;

public interface ConfigurableApplicationContext extends ListableBeanFactory {

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
