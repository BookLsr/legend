package com.wang.web.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


/**
 * Description 异常处理 注意：需要在jersey.config.server.provider.packages 配置异常处理类所在包
 * @Author windpursuer
 * @Date 2017/8/14 15:10
 */
@Provider
public class ExceptionMapperSupport implements ExceptionMapper<Throwable> {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionMapperSupport.class);

    @Override
    public Response toResponse(Throwable e) {
        logger.error("异常原因：【{}】", e.getMessage());
        return Response.ok("success Exception", MediaType.APPLICATION_JSON).build();
    }
}
