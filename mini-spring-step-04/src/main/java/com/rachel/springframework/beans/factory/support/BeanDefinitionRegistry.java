package com.rachel.springframework.beans.factory.support;

import com.rachel.springframework.beans.factory.config.BeanDefinition;

/**
 * @author rachel
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String name, BeanDefinition beanDefinition);


}
