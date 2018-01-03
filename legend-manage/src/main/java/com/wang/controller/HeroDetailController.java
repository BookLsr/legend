package com.wang.controller;

import com.wang.entity.HeroDetailEntity;
import com.wang.service.HeroDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description 英雄信息Controller
 * @Author windpursuer
 * @Date 2017/8/11 16:27
 */
@Controller
@RequestMapping("hero")
public class HeroDetailController {
    private static final Logger logger = LoggerFactory.getLogger(HeroDetailController.class);

    @Autowired
    private HeroDetailService heroDetailService;

    @RequestMapping("getHero")
    @ResponseBody
    public HeroDetailEntity getHeroDetail()throws Exception {
        //HeroDetailEntity heroDetailEntity = heroDetailService.getHeroDetailById(1);
        //heroDetailService.saveUser2("li", "ds");
        heroDetailService.saveUser2("as", "ds");
        logger.debug("Controller运行");
        return null;
    }
}
