package com.ybl;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ApplicationTests {
    @Value("${duanwj.value}")
    private String name;
    @Value("${duanwj.int}")
    private int number;

    @Test
    public void contextLoads() {
        log.info("随机字符串{}" , name);
        log.info("随机int{}" ,number);
        log.error("日志级别error");
        log.warn("日志级别warn");
        log.info("日志级别info");
        log.debug("日志级别debug");
    }

}
