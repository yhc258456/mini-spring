package com.rachel.springframework.beans.factory;

public interface InitializingBean {

    /**
     * 处理属性填充后调用
     *
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;

}
