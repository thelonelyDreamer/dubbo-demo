package com.felixwc.dubbo.demo1.service.remote;

import com.felixwc.dubbo.demo1.function.module1.Available;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * in order to learn java!
 * created at 2021/11/5 20:02
 *
 * @author wangchao
 */
@DubboService
public class AvailableImpl implements Available {
    @Override
    public String getHi() {
        return "hello";
    }
}
