package com.rachel.springframework.aop.aspectj;

import com.rachel.springframework.aop.PointAdvisor;
import com.rachel.springframework.aop.Pointcut;
import org.aopalliance.aop.Advice;

/**
 * 整合切面和拦截方法 使得在xml配置即可定义一个PointAdvisor切面拦截器了
 */
public class AspectJExpressionPointcutAdvisor implements PointAdvisor {

    // 切面
    private AspectJExpressionPointcut pointcut;

    // 通知
    private Advice advice;

    // 表达式
    private String expression;


    @Override
    public Advice getAdvice() {
        return advice;
    }

    @Override
    public Pointcut getPointcut() {
        if (pointcut == null) {
            return new AspectJExpressionPointcut(expression);
        }
        return pointcut;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }

}
