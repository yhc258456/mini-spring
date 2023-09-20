package com.rachel.springframework.beans.factory;

import com.rachel.springframework.beans.BeansException;

/**
 * 实现此接口，能感知到所属的 BeanFactory
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
