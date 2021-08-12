package com.redmaple;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 若成风
 * @description
 * @date 2021/8/12 22:06
 * @copyright (c) 2021, all rights reserved
 **/
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class AppMybatisPlus {
    public static void main(String[] args) {
        SpringApplication.run(AppMybatisPlus.class);
    }
}
