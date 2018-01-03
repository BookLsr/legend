package com.wang.config;

import org.glassfish.jersey.servlet.ServletContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Description Web相关配置
 * @Author windpursuer
 * @Date 2017/8/14 14:02
 */
@Configuration
public class WebConfig {
    private static final Logger logger = LoggerFactory.getLogger(WebConfig.class);

    @Bean
    public ServletRegistrationBean servletJerseyRegistrationBean() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new ServletContainer());
        Map<String, String> param = new HashMap<String, String>();
        param.put("jersey.config.server.provider.packages", "com.wang.controller,com.wang.web");
        param.put("jersey.config.server.wadl.disableWadl", "true");
        servletRegistrationBean.setInitParameters(param);
        servletRegistrationBean.setLoadOnStartup(1);
        List<String> pattern = new ArrayList<String>();
        pattern.add("/server/*");
        servletRegistrationBean.setUrlMappings(pattern);
        logger.debug("jerseyServlet设置");
        return servletRegistrationBean;
    }
}
