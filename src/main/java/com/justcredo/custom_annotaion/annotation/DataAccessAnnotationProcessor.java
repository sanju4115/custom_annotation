package com.justcredo.custom_annotaion.annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

@Component
public class DataAccessAnnotationProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        this.scanDataAccessAnnotation(bean, beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        return bean;
    }

    private void scanDataAccessAnnotation(Object bean, String beanName) {
        this.configureFieldInjection(bean);
    }

    private void configureFieldInjection(Object bean) {
        Class<?> managedBeanClass = bean.getClass();
        ReflectionUtils.doWithFields(managedBeanClass, field -> {
            if (!field.isAnnotationPresent(DataAccess.class)) {
                return;
            }
            ReflectionUtils.makeAccessible(field);
            String value = field.getDeclaredAnnotation(DataAccess.class).entity();
            if (value.equalsIgnoreCase("value")) {
                field.set(bean, "Sanjay");
            } else if (value.equalsIgnoreCase("xyz")){
                field.set(bean, "Rahul");
            } else{
                field.set(bean, "default");
            }
        });
    }
}
