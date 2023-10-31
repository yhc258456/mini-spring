package com.rachel.springframework.beans.factory;

/**
 * 实现此接口，能感知到所属的eanName
 */
public interface BeanNameAware extends Aware {

    void setBeanName(String beanName);

}
