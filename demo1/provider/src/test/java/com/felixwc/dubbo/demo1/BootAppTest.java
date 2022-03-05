package com.felixwc.dubbo.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class BootAppTest {
    @Autowired
    private ApplicationContext context;
}