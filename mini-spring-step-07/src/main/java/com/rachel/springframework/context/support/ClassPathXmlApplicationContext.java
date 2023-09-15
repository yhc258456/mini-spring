package com.rachel.springframework.context.support;

public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext {

    private String[] configLocations;

    public ClassPathXmlApplicationContext() {

    }

    /**
     * 从xml 中获取beanDefinitions，并刷新上下文
     *
     * @param configLcations
     */
    public ClassPathXmlApplicationContext(String configLcations) {
        this(new String[]{configLcations});
    }

    /**
     * 从xml 中获取beanDefinitions，并刷新上下文
     *
     * @param configLcations
     */
    public ClassPathXmlApplicationContext(String[] configLcations) {
        this.configLocations = configLcations;
        refresh();
    }

    @Override
    protected String[] getConfigLocations() {
        return configLocations;
    }
}
