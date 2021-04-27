package com.spaopprgproject.spaopprg.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAop {

    // @After("execution(* com.spaopprgproject.spaopprg.impl.MyImpl.checkAop())")
    // public void checkAop(){
    // System.out.println("After Advice executed");
    // }

    //@Before("execution(* com.spaopprgproject.spaopprg.impl.MyImpl.checkAop())")
    //public void checkAop(){
    //   System.out.println("In Aop Class");
    //}

    @AfterReturning(pointcut = "execution(* com.spaopprgproject.spaopprg.impl.MyImpl.checkAop())",
                    returning = "retValue")
    public void checkAfterReturn(Object retValue){
       String str=(String) retValue;
        System.out.println("Returned Value: "+str);
    }

    //@Around("execution(* com.spaopprgproject.spaopprg.impl.MyImpl.checkAop())")
    //public Object checkAround(ProceedingJoinPoint jp) throws Throwable{
    //    System.out.println("Before...");
    //    Object result=jp.proceed();
    //    System.out.println("After...");
    //    return result;
   //}

    //@AfterThrowing(value = "execution(* com.spaopprgproject.spaopprg.impl.MyImpl.checkAop())",
    //               throwing = "error")
    //public void checkAfterThrowing(Object error){
    //    String str=(String) error;
    //    System.out.println("Throwing Value: "+str);
    // }



}
