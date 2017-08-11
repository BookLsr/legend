package com.wang.web.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class SystemInitListener implements ServletContextListener {
    private static final Logger logger = LoggerFactory.getLogger(SystemInitListener.class);

    /**
     * Description Servlet初始化事件
     * @Author windpursuer
     * @Date 2017/8/11 17:07
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.debug("servlet初始化");
    }

   /**
    * Description Servlet销毁事件
    * @Author windpursuer
    * @Date 2017/8/11 17:08
    */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.debug("servlet关闭");
    }
}
