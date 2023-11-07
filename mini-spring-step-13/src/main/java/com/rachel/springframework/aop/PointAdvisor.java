package com.rachel.springframework.aop;


/**
 * 定义访问者 Advisor
 */
public interface PointAdvisor extends Advisor {

    Pointcut getPointcut();

}
