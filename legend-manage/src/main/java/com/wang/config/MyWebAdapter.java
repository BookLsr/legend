package com.wang.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Description SpringMvc Web相关配置
 * @Author windpursuer
 * @Date 2017/8/11 17:21
 */
@Configuration
public class MyWebAdapter extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        /**
         * 可需要可不要，，主要需要在yml文件中配置静态资源访问路径
         */
        registry.addViewController( "/" ).setViewName( "index.html" );
        registry.setOrder( Ordered.HIGHEST_PRECEDENCE );
        super.addViewControllers(registry);
    }
}
