package com.felixxw.dubbo.demo1.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * in order to learn java!
 * created at 2022/2/25 22:51
 *
 * @author wangchao
 */
@SpringBootApplication
@EnableDubbo
public class BootConsumer {
    public static void main(String[] args) {
        SpringApplication.run(BootConsumer.class,args);
    }
}
