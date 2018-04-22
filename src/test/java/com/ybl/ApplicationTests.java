package com.ybl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Value("${duanwj.value}")
    private String name;
    @Value("${duanwj.int}")
    private  int number;

    @Test
    public void contextLoads() {
        System.out.println("随机字符串"+name);
        System.out.println("随机int"+number);
    }

}
