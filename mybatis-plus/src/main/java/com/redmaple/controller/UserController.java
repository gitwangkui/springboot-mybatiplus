package com.redmaple.controller;

import com.redmaple.mapper.SysRoleMapper;
import com.redmaple.model.SysRole;
import com.redmaple.model.User;
import com.redmaple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 若成风
 * @description
 * @date 2021/8/12 22:21
 * @copyright (c) 2021, all rights reserved
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @GetMapping("/test1")
    public String test1(String id){
        System.out.println(">>>>> test1 start <<<<<");
        User byId = userService.getById(id);
        System.out.println(">>>>>byId: " + byId.toString());

        SysRole sysRole = sysRoleMapper.selectById(id);
        System.out.println(sysRole.toString());

        return byId.toString() + "\n" + sysRole.toString();
    }
}
