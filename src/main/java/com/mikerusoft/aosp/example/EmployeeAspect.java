package com.mikerusoft.aosp.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Grinfeld Mikhail
 * @since 7/30/2017.
 */
@Aspect
@Component
public class EmployeeAspect {
    @Before("execution(public String getName())")
    public void getNameAdvice(){
        System.out.println("Executing Advice on getName()");
    }

    @Before("execution(* com.mikerusoft.aosp.example.EmployeeService.*.get*())")
    public void getAllAdvice(){
        System.out.println("Service method getter called");
    }
}
