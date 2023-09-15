package cn.bugstack.springframework.test.common;

import com.rachel.springframework.beans.BeansException;
import com.rachel.springframework.beans.PropertyValue;
import com.rachel.springframework.beans.PropertyValues;
import com.rachel.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.rachel.springframework.beans.factory.config.BeanDefinition;
import com.rachel.springframework.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }

}
