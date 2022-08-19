package com.rachel.springframework.beans.factory.support;

import com.rachel.springframework.beans.BeansException;
import com.rachel.springframework.beans.factory.BeanFactory;
import com.rachel.springframework.beans.factory.config.BeanDefinition;

/**
 * @author rachel
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String name) throws BeansException;

    protected abstract Object createBean(String name, BeanDefinition beanDefinition) throws BeansException;


}
