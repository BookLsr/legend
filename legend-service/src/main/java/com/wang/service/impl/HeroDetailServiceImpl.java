package com.wang.service.impl;

import com.wang.dao.HeroDetailDao;
import com.wang.entity.HeroDetailEntity;
import com.wang.service.HeroDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description HeroDetail service实现层
 * @Author windpursuer
 * @Date 2017/8/10 19:18
 */
@Service
public class HeroDetailServiceImpl implements HeroDetailService {
    private Logger logger = LoggerFactory.getLogger(HeroDetailServiceImpl.class);
    @Autowired
    private HeroDetailDao heroDetailDao;
    /**
     * Description 根据ID获取用户信息
     * @param id
     * @Author windpursuer
     * @Date 2017/8/10 19:28
     */
    @Override
    public HeroDetailEntity getHeroDetailById(int id) {
        HeroDetailEntity heroDetailEntity = heroDetailDao.getHeroDetailById(1);
        logger.debug("根据ID查询英雄信息如下：【{}】", heroDetailEntity.toString());
        return heroDetailEntity;
    }
}
