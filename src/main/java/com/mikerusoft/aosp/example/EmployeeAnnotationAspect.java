package com.mikerusoft.aosp.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Grinfeld Mikhail
 * @since 7/30/2017.
 */
@Aspect
@Component
public class EmployeeAnnotationAspect {
    @Before("@annotation(com.mikerusoft.aosp.example.Loggable)")
    public void myAdvice(){
        System.out.println("Executing myAdvice!!");
    }

    @AfterReturning("execution(* com.mikerusoft.aosp.example.EmployeeService.setEmployee(..)) && @annotation(com.mikerusoft.aosp.example.Loggable)")
    public void logServiceAccess(JoinPoint joinPoint) {
        System.out.println("Completed + annotation: " + joinPoint);
    }
}
