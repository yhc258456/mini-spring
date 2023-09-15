package com.rachel.springframework.context;

import com.rachel.springframework.beans.BeansException;
import com.rachel.springframework.beans.factory.Aware;

/**
 * 实现此接口，能感知到所属的上下文对象
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
