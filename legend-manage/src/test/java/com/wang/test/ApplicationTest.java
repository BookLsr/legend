package com.wang.test;

import com.wang.Application;
import com.wang.service.HeroDetailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Description SpringBoot 测试类
 * @Author windpursuer
 * @Date 2017/8/10 19:33
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class ApplicationTest {
    @Autowired
    private HeroDetailService heroDetailService;

    @Test
    public void testShow() {
        heroDetailService.getHeroDetailById(1);
    }
}
