package com.rachel.springframework.test;

import com.rachel.springframework.test.bean.UserService;
import com.rachel.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.openjdk.jol.info.ClassLayout;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public class ApiTest {

    @Test
    public void test_prototype() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        // 2. 获取Bean对象调用方法
        UserService userService1 = applicationContext.getBean("userService", UserService.class);
        UserService userService2 = applicationContext.getBean("userService", UserService.class);

        // 3.打印地址
        System.out.println(userService1);
        System.out.println(userService2);

        // 4. 打印十六进制哈希
        System.out.println(userService1 + " 十六进制哈希：" + Integer.toHexString(userService1.hashCode()));
        System.out.println(ClassLayout.parseInstance(userService1).toPrintable());
    }

    @Test
    public void test_factory_bean() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        // 2. 获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);

        // 3. 打印十六进制哈希
        System.out.println("测试结果: " + userService.queryUserInfo());
    }

}
