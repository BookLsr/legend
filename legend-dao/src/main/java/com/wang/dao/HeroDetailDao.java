package com.wang.dao;

import com.wang.entity.HeroDetailEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description HeroDetailDao层
 * @Author windpursuer
 * @Date 2017/8/10 19:17
 */
@Mapper
public interface HeroDetailDao {
    /**
     * Description 根据ID获取获取英雄信息
     * @Author windpursuer
     * @Date 2017/8/10 19:26
     */
    HeroDetailEntity getHeroDetailById(int id);

    void insertHero(@Param("name") String name,@Param("age") String age);
}
