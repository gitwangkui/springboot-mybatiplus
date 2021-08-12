package com.redmaple.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.redmaple.model.User;

/**
 * Description:
 * date: 2021/8/12 22:15
 *
 * @author 若成风
 */
public interface UserService extends IService<User> {

    User getById(String id);
}
