package com.rachel.springframework.aop;


import org.aopalliance.aop.Advice;

import java.lang.reflect.Method;

/**
 * 前置通知
 */
public interface BeforeAdvice extends Advice {
    void before(Method method, Object[] args, Object target) throws Throwable;

}
