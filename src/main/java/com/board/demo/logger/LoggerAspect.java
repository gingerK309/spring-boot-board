package com.board.demo.logger;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.thymeleaf.util.StringUtils;

@Slf4j
@Aspect
@Component
public class LoggerAspect {
    @Around("execution(* com.board.demo..*Controller.*(..)) || execution(* com.board.demo..*Service.*(..)) || execution(* com.board.demo..*Mapper.*(..))")
    public Object printLog(ProceedingJoinPoint joinPoint) throws Throwable{
        String name = joinPoint.getSignature().getDeclaringTypeName();
        String type = "";
        if(StringUtils.contains(name,"Controller")){
            type = "Controller ===> ";
        }
        if(StringUtils.contains(name,"Service")){
            type = "Service ===> ";
        }
        if(StringUtils.contains(name,"Mapper")){
            type = "Mapper ===> ";
        }
        log.debug(type+name+"."+joinPoint.getSignature().getName()+"()");
        return joinPoint.proceed();
    }





}
