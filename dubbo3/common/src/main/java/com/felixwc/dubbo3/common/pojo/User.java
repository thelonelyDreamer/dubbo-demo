package com.felixwc.dubbo3.common.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * in order to learn java!
 * created at 2022/7/13 01:33
 *
 * @author felixwc
 */
@Data
public class User implements Serializable {
    private String name;
    private Integer age;
}
