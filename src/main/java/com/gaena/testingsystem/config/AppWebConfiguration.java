package com.gaena.testingsystem.config;

import com.gaena.testingsystem.controller.RequestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppWebConfiguration implements WebMvcConfigurer {

    private final RequestInterceptor requestInterceptor;

    public AppWebConfiguration(RequestInterceptor requestInterceptor) {
        this.requestInterceptor = requestInterceptor;
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestInterceptor);
    }
}
