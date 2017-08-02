package com.mikerusoft.aosp.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Grinfeld Mikhail
 * @since 7/30/2017.
 */
@Aspect
@Component
public class EmployeeAroundAspect {
    @Around("execution(* com.mikerusoft.aosp.example.Employee.getName())")
    public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("Before invoking getName() method");
        Object value = null;
        try {
            value = "Changed " + String.valueOf(proceedingJoinPoint.proceed());
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("After invoking getName() method. Return value="+value);
        return value;
    }
}
