package com.redmaple.model;

import lombok.Data;
import lombok.ToString;

/**
 * @author 若成风
 * @description
 * @date 2021/8/12 22:13
 * @copyright (c) 2021, all rights reserved
 **/
@Data
@ToString
public class User {
    private Integer id;
    private String name;
    private Integer age;
}
