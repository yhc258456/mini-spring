package com.rachel.springframework.beans.factory;

import com.rachel.springframework.beans.BeansException;

/**
 * @author rachel
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
