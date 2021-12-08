package com.eu.eufof.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eu.eufof.entity.UserInfo;
import com.eu.eufof.mapper.UserInfoMapper;
import com.eu.eufof.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUser(int id) {
        UserInfo userInfo = userInfoMapper.getUser(id);
        return userInfo;
    }
}
