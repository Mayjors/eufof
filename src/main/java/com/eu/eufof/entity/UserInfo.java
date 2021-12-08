package com.eu.eufof.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("user")
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 2279826920415137369L;

    private Integer id;
    private String name;
    private String nickName;
    private Integer age;
    private Integer gender;
    private String phone;
    private String country;
    private String province;
    private String city;
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
//    private Integer isDelete;
}
