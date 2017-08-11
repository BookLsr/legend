package com.wang.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.wang.Application;
import com.wang.service.HeroDetailService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

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
    public void testService() {
        heroDetailService.getHeroDetailById(1);
    }

    MockMvc mvc;

    @Autowired
    WebApplicationContext webApplicationContext;

    @Before
    public void setUp() throws JsonProcessingException {
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

    }

    /**
     * Description 测试Controller
     * @Author windpursuer
     * @Date 2017/8/11 16:59
     */
    @Test
    public void testController() throws Exception {
        String expectedResult = "hello world!";
        String uri = "/hero/getHero";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri).accept(MediaType.APPLICATION_JSON))
                .andReturn();
        int status = mvcResult.getResponse().getStatus();
        String content = mvcResult.getResponse().getContentAsString();
        System.out.println(status + "----" + content);
        Assert.assertTrue("错误，正确的返回值为200 2", status == 200);
        Assert.assertFalse("错误，正确的返回值为200 1", status != 200);
        /*Assert.assertTrue("数据一致", expectedResult.equals(content));
        Assert.assertFalse("数据不一致", !expectedResult.equals(content));*/
    }
}
