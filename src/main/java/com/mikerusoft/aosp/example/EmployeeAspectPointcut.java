package com.mikerusoft.aosp.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Grinfeld Mikhail
 * @since 7/30/2017.
 */
@Aspect
@Component
public class EmployeeAspectPointcut {
    @Before("getNamePointcut()")
    public void loggingAdvice(){
        System.out.println("Executing loggingAdvice on getName()");
    }

    @Before("getNamePointcut()")
    public void secondAdvice(){
        System.out.println("Executing secondAdvice on getName()");
    }

    @Pointcut("execution(public String getName())")
    public void getNamePointcut(){}

    @Before("allMethodsPointcut()")
    public void allServiceMethodsAdvice(){
        System.out.println("Before executing service method");
    }

    //Pointcut to execute on all the methods of classes in a package
    @Pointcut("within(com.mikerusoft.aosp.example.EmployeeService.*)")
    public void allMethodsPointcut(){}
}
