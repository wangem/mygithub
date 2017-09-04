package com.answern;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OwnerAutoConfiguration implements BeanFactoryAware {

//	 private BeanFactory beanFactory;
	 
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        this.beanFactory = beanFactory;
    }
    
    @Bean
    @ConditionalOnMissingBean
    public OwnerProperties ownerProperties() {
        return new OwnerProperties();
    }
 
    
	  

}
