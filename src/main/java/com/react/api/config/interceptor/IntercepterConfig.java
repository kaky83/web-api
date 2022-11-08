package com.react.api.config.interceptor;

import com.react.api.common.interceptor.AccessLoggingInterceptor;
import com.react.api.common.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class IntercepterConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        /*registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/users/login");*/
        registry.addInterceptor(new AccessLoggingInterceptor()).addPathPatterns("/**").excludePathPatterns("/resources/**");

        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
