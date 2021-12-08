package com.eu.eufof.controller;

import com.eu.eufof.entity.UserInfo;
import com.eu.eufof.service.UserInfoService;
import com.eu.eufof.utils.HttpResult;
import com.eu.eufof.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("getUser/{id}")
    public HttpResult getUser(@PathVariable int id) {
        UserInfo userInfo = userInfoService.getUser(id);
        log.info("aaaaa");
        log.debug("aaaaa");
        log.warn("aaaaa");
        log.error("aaaaa");
        return ResultUtil.success(userInfo);
    }

    @PostMapping("insert")
    public HttpResult insert(@RequestBody UserInfo userInfo) {
        userInfoService.insert(userInfo);
        return ResultUtil.success();
    }

}
