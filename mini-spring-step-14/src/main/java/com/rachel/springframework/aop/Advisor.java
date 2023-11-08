package com.rachel.springframework.aop;


import org.aopalliance.aop.Advice;

/**
 * 定义访问者 Advisor
 */
public interface Advisor {


    Advice getAdvice();
}
