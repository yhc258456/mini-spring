package com.rachel.springframework.beans.factory.support;

import com.rachel.springframework.beans.BeansException;
import com.rachel.springframework.beans.factory.config.BeanDefinition;
import com.rachel.springframework.core.io.Resource;
import com.rachel.springframework.core.io.ResourceLoader;

/**
 * @author rachel
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;

}
