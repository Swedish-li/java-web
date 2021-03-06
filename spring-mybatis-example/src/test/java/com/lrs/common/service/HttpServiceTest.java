package com.lrs.common.service;

import static org.junit.Assert.fail;

import java.io.IOException;

import javax.annotation.Resource;

import org.apache.http.client.ClientProtocolException;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lrs.common.pojo.HttpResult;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class HttpServiceTest extends AbstractJUnit4SpringContextTests {
    @Resource
    HttpService httpService;

    @Test
    public void testDoGetString() throws IOException {
        String str = httpService.doGet("http://www.baidu.com");
        System.out.println(str);
    }


    @Ignore
    @Test
    public void testDoPostString() throws IOException {
        HttpResult result = httpService.doPost("http://www.baidu.com");
        System.out.println(result);
    }

}
