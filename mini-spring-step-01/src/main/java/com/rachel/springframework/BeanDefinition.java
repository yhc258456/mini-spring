package com.rachel.springframework;

/**
 * @author rachel
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean){
        this.bean = bean;
    }

    public Object getBean(){
        return this.bean;
    }

}
