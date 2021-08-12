package com.redmaple.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.redmaple.mapper.UserMapper;
import com.redmaple.model.User;
import com.redmaple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 若成风
 * @description
 * @date 2021/8/12 22:16
 * @copyright (c) 2021, all rights reserved
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(String id) {
        User user = userMapper.selectById(id);
        return user;
    }
}
