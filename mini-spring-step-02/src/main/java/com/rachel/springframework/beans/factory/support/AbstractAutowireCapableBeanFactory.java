package com.rachel.springframework.beans.factory.support;

import com.rachel.springframework.beans.BeansException;
import com.rachel.springframework.beans.factory.config.BeanDefinition;

/**
 * @author rachel
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        }
        catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }

}
