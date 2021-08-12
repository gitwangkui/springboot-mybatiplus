package com.redmaple.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.redmaple.model.SysRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description:
 * date: 2021/8/12 23:20
 *
 * @author 若成风
 */
@Mapper
@DS("njds_warehouse")
public interface SysRoleMapper extends BaseMapper<SysRole> {

}
