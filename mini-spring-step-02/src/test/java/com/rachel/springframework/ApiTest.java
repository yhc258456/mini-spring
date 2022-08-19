package com.rachel.springframework;

import com.rachel.springframework.bean.UserService;
import com.rachel.springframework.beans.factory.config.BeanDefinition;
import com.rachel.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    public void test(){
        // 初始化bean工厂
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 第一次获取bean
        UserService userServiceFromContainer = (UserService)beanFactory.getBean("userService");
        userServiceFromContainer.queryUserInfo();

        // 第二次获取bean
        UserService userService_singleton = (UserService)beanFactory.getSingleton("userService");
        userService_singleton.queryUserInfo();

        System.out.println(userServiceFromContainer == userService_singleton);
    }

}
