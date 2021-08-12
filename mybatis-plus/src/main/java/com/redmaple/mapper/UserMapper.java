package com.redmaple.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.redmaple.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description:
 * date: 2021/8/12 22:15
 *
 * @author 若成风
 */
@Mapper
@DS("gi_test")
public interface UserMapper extends BaseMapper<User> {

}
