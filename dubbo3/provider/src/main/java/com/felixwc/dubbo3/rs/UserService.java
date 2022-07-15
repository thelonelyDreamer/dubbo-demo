package com.felixwc.dubbo3.rs;

import com.felixwc.dubbo3.common.pojo.User;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * in order to learn java!
 * created at 2022/7/13 23:28
 *
 * @author felixwc
 */
@DubboService
public class UserService implements com.felixwc.dubbo3.common.service.UserService {
    @Override
    public User getOneUser() {
        return null;
    }
}
