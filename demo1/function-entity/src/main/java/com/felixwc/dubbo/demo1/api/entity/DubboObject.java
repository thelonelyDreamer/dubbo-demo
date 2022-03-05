package com.felixwc.dubbo.demo1.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * in order to learn java!
 * created at 2022/2/25 22:21
 *
 * @author wangchao
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DubboObject implements Serializable {
    private static final long serialVersionUID = -7564835224189971712L;
    private String name;
}
