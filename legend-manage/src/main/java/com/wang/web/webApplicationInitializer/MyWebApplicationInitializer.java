package com.wang.web.webApplicationInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Description 自定义WebApplicationInitializer,用于测试SpringBoot启动流程
 * @Author windpursuer
 * @Date 2017/8/14 11:02
 */
@Order(1)
public class MyWebApplicationInitializer implements WebApplicationInitializer {

    private static final Logger logger = LoggerFactory.getLogger(MyWebApplicationInitializer.class);

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.setInitParameter("resteasy.providers", "com.wang.web.exception.ExceptionMapperSupport");
        logger.debug("启动加载自定义的MyWebApplicationInitializer");
    }
}
