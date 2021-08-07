package com.finedu.springboot.config.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeTraceAop {
    // 시간 측정 로직
    @Around("execution(* com.finedu..*(..))")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable{
        long start = System.currentTimeMillis();
        System.out.println(joinPoint.toString());
        try {
            return joinPoint.proceed();
        }
        finally {
            long finish = System.currentTimeMillis();
            long time = finish - start;
            System.out.println("END : " + joinPoint.toString() + " " + time + "ms");
        }

    }
}
