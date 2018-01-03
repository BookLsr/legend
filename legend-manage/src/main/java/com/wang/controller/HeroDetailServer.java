package com.wang.controller;

import com.wang.entity.HeroDetailEntity;
import com.wang.service.HeroDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Description Jersey路由设置
 * @Author windpursuer
 * @Date 2017/8/14 14:25
 */
@Component
@Path("hero")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class HeroDetailServer {
    private static final Logger logger = LoggerFactory.getLogger(HeroDetailServer.class);

    @Autowired
    private HeroDetailService heroDetailService;

    @GET
    @Path("getHero")
    public Object getHeroDetail(@QueryParam("id") String id)  throws Exception {
       // HeroDetailEntity heroDetailEntity = heroDetailService.getHeroDetailById(1);
        heroDetailService.saveUser2("li", "ds");
        logger.debug("Jersey运行,【{}】", id);
        return null;
    }
}
