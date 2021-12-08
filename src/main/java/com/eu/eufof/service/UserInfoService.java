package com.eu.eufof.service;

import com.baomidou.mybatisplus.service.IService;
import com.eu.eufof.entity.UserInfo;


public interface UserInfoService extends IService<UserInfo> {

    UserInfo getUser(int id);

    boolean insert(UserInfo info);
}
