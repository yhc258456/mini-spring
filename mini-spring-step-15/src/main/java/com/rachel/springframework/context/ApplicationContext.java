package com.rachel.springframework.context;

import com.rachel.springframework.beans.factory.HierarchicalBeanFactory;
import com.rachel.springframework.beans.factory.ListableBeanFactory;
import com.rachel.springframework.core.io.ResourceLoader;

public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader,ApplicationEventPublisher {
}
