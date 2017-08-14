package com.wang.web.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description 自定义Http请求Filter
 * @Author windpursuer
 * @Date 2017/8/14 13:49
 */
@WebFilter(filterName = "myFilter", urlPatterns = "/*")
public class MyFilter implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setCharacterEncoding("UTF-8");
        String path = httpServletRequest.getRequestURI();
        long start = System.currentTimeMillis();
        chain.doFilter(httpServletRequest,httpServletResponse);
        long end = System.currentTimeMillis();
        logger.debug("网络请求【{}】的接口耗时【{}】", path, end - start);
    }

    @Override
    public void destroy() {

    }
}
