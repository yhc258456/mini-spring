package com.rachel.springframework.beans.factory.support;

import com.rachel.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rachel
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private final Map<String, Object> singleObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singleObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singleObjects.put(beanName, singletonObject);
    }

}
