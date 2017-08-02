package com.mikerusoft.aosp.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Grinfeld Mikhail
 * @since 7/30/2017.
 */
@Aspect
@Component
public class EmployeeAspectJoinPoint {

    @Before("execution(public void com.mikerusoft.aosp.example.Employee.set*(*))")
    public void loggingAdvice(JoinPoint joinPoint){
        System.out.println("Before running loggingAdvice on method="+joinPoint.toString());

        System.out.println("Arguments Passed=" + Arrays.toString(joinPoint.getArgs()));

    }

    //Advice arguments, will be applied to bean methods with single String argument
    // TODO: it throws exception since expression in @Before should be more specific
/*    @Before("args(name)")
    public void logStringArguments(String name){
        System.out.println("String argument passed="+name);
    }*/
}
