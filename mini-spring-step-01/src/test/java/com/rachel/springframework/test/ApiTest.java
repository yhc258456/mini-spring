package com.rachel.springframework.test;

import com.rachel.springframework.BeanDefinition;
import com.rachel.springframework.BeanFactory;
import com.rachel.springframework.test.bean.UserService;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    public void test(){
        // 初始化bean工厂
        BeanFactory beanFactory = new BeanFactory();

        // 注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 获取bean
        UserService userServiceFromContainer = (UserService)beanFactory.getBean("userService");

        // 调用bean方法
        userServiceFromContainer.queryUserInfo();
    }

}
