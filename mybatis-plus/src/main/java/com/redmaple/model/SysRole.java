package com.redmaple.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author 若成风
 * @description
 * @date 2021/8/12 23:18
 * @copyright (c) 2021, all rights reserved
 **/
@Data
@ToString
public class SysRole {
    private Integer id;
    private String name;
    private String remark;
    private Integer available;
    private Date createtime;
}
