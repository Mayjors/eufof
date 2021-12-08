package com.eu.eufof.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value = {"com.eu.eufof.**.mapper*"})
public class MybatisPlusConfig {

    /**
     *  分页插件  MybatisPlus提供的分页
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        // 设置sql的limit为无限制，默认是500
        return new PaginationInterceptor();
    }

}
