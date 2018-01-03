package com.wang.service;

import com.wang.entity.HeroDetailEntity;

/**
 * Description HeroDetail service接口层
 * @Author windpursuer
 * @Date 2017/8/10 19:18
 */
public interface HeroDetailService {
    /**
     * Description 根据ID获取用户信息
     * @Author windpursuer
     * @Date 2017/8/10 19:28
     */
    HeroDetailEntity getHeroDetailById(int id);


    void saveUser1(String name, String age) throws Exception;

    void saveUser2(String name, String age) throws Exception;
}
