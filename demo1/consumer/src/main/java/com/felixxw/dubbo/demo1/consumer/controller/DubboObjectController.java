package com.felixxw.dubbo.demo1.consumer.controller;

import com.felixwc.dubbo.demo1.api.entity.DubboObject;
import com.felixwc.dubbo.demo1.api.function.common.DubboObjectService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/2/25 23:11
 *
 * @author wangchao
 */
@RestController
@RequestMapping("object")
public class DubboObjectController {
    @DubboReference(version = "1.0",group = "provider-demo1",loadbalance = "random")
    private DubboObjectService objectService;

    @GetMapping("one")
    private DubboObject getADubboObject(){
        return objectService.getADubboObject();
    }

}
