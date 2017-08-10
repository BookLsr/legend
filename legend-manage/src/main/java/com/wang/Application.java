package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Description legend后台管理启动类
 * @Author windpursuer
 * @Date 2017/8/10 10:20
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    /**
     * Description 使用外部tomcat
     * @Author windpursuer
     * @Date 2017/8/10 14:34
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.sources(this.getClass());
        return super.configure(builder);
    }

    /**
     * Description springboot启动主函数
     * @Author windpursuer
     * @Date 2017/8/10 10:55
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
