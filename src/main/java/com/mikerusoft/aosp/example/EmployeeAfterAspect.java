package com.mikerusoft.aosp.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Grinfeld Mikhail
 * @since 7/30/2017.
 */
@Aspect
@Component
public class EmployeeAfterAspect {
    // TODO: it throws exception since @After should be more specific
/*    @After("args(name)")
    public void logStringArguments(String name){
        System.out.println("Running After Advice. String argument passed="+name);
    }*/

    @AfterThrowing("within(com.mikerusoft.aosp.example.Employee)")
    public void logExceptions(JoinPoint joinPoint){
        System.out.println("Exception thrown in Employee Method="+joinPoint.toString());
    }

    @AfterReturning(pointcut="execution(* getName())", returning="returnString")
    public void getNameReturningAdvice(String returnString){
        System.out.println("getNameReturningAdvice executed. Returned String="+returnString);
    }
}
