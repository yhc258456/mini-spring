package com.rachel.springframework.beans.factory.config;

/**
 * @author rachel
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
