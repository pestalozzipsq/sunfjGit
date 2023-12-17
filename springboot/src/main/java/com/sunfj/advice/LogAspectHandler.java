package com.sunfj.advice;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
@Slf4j
public class LogAspectHandler {
    @Pointcut("execution(* com.sunfj.controller..*.*(..))")
    public void pointcut(){
    }


    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint){

        Signature signature = joinPoint.getSignature();
        String declaringTypeName = signature.getDeclaringTypeName();

        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = null;
        if (requestAttributes != null) {
            request = requestAttributes.getRequest();
        }
        String requestURL = null;
        if (request != null) {
            requestURL = request.getRequestURL().toString();
        }
        log.info(declaringTypeName+"控制层被访问"+requestURL);
    }

    /**
     * 在上面定义的切面方法之后执行该方法
     * @param joinPoint jointPoint
     */
    @After("pointcut()")
    public void doAfter(JoinPoint joinPoint) {

        log.info("====doAfter方法进入了====");
        Signature signature = joinPoint.getSignature();
        String method = signature.getName();
        log.info("方法{}已经执行完", method);
    }

    @AfterReturning(pointcut = "pointcut()" ,returning ="result")
    public void doAfterReturning(JoinPoint joinPoint,Object result){
        Signature signature = joinPoint.getSignature();
        String classMethod = signature.getName();
        log.info("方法{}执行完毕，返回参数为：{}", classMethod, result);
        // 实际项目中可以根据业务做具体的返回值增强
        result = result.toString()+"ABC";
        log.info("对返回参数进行业务上的增强：{}", result + "增强版");
    }


}
