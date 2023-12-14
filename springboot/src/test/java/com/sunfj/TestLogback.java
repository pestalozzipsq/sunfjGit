package com.sunfj;

import com.sunfj.service.LogbackService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestLogback {
    @Autowired
    private LogbackService logbackService;
    @Test
    public void test1(){
        logbackService.test();
    }
}
