package com.rachel.springframework.beans.factory.config;

import com.rachel.springframework.beans.BeansException;

public interface BeanPostProcessor {

    /**
     * 在Bean 对象执行初始化方法之前，执行此方法
     *
     * @param bean
     * @param beanName
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException;

    /**
     * 在Bean 对象执行初始化方法之后，执行此方法
     *
     * @param bean
     * @param beanName
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException;

}
