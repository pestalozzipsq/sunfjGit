package com.sunfj.handler;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

@Slf4j
public class TestHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(request.getRemoteHost()+request.getRemotePort());
        log.info("接受请求："+requestURL);
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
