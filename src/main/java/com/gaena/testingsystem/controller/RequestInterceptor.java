package com.gaena.testingsystem.controller;

import com.gaena.testingsystem.beans.RequestStateProcess;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class RequestInterceptor implements HandlerInterceptor {

    private final RequestStateProcess requestStateProcess;

    public RequestInterceptor(RequestStateProcess requestStateProcess) {
        this.requestStateProcess = requestStateProcess;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        requestStateProcess.setRequestMethod(request.getMethod());
        System.out.println(requestStateProcess);

        return true;
    }
}
