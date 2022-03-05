package com.felixwc.dubbo.demo1.provider.service.remote;

import com.felixwc.dubbo.demo1.api.entity.DubboObject;
import com.felixwc.dubbo.demo1.api.function.common.DubboObjectService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * in order to learn java!
 * created at 2021/11/5 20:02
 *
 * @author wangchao
 */
@DubboService(version = "1.0",group = "provider-demo1")
@Service
public class DubboObjectServiceImpl implements DubboObjectService {
    @Override
    public DubboObject getADubboObject() {
        return new DubboObject("first object");
    }
}
