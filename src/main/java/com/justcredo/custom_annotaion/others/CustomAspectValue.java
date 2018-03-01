package com.justcredo.custom_annotaion.others;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class CustomAspectValue {

    @Pointcut("@annotation(com.justcredo.custom_annotaion.others.CustomValue)")
    public void annotationPointCutDefinition(){
    }

    @Pointcut("execution(public Void com.justcredo.custom_annotaion.annotation.Test.test())")
    public void test(){
    }

    @Before("annotationPointCutDefinition()")
    public void printNewLine(JoinPoint pointcut){
        //Just prints new lines after each method that's executed in
        System.out.println("before executed");
    }

    @Before("test()")
    public void test(JoinPoint pointcut){
        //Just prints new lines after each method that's executed in
        System.out.println("before executed");
    }
}
