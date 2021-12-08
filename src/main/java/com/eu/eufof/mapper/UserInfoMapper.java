package com.eu.eufof.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.eu.eufof.entity.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoMapper extends BaseMapper<UserInfo> {
    UserInfo getUser(int id);
}
