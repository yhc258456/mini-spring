package com.rachel.springframework.beans.factory.support;

import com.rachel.springframework.beans.BeansException;
import com.rachel.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author rachel
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
