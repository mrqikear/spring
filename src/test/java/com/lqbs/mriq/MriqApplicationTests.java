package com.lqbs.mriq;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MriqApplicationTests {
    @Autowired
    private HttpClient httpClient;
    @Test
    public void testHttpclient() throws IOException {
        //访问百度，输出百度网页
        System.out.println(EntityUtils.toString(httpClient.execute(new HttpGet("http://www.hao123.com")).getEntity()));
    }

}
