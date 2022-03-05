package com.felixwc.dubbo.demo1.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * in order to learn java!
 * created at 2021/11/5 19:32
 *
 * @author wangchao
 */
@SpringBootApplication
@EnableDubbo
public class BootProvider {
    public static void main(String[] args) {
        SpringApplication.run(BootProvider.class,args);
    }
}
