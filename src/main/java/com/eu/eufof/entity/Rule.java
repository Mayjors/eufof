package com.eu.eufof.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("rule")
public class Rule implements Serializable {
    private static final long serialVersionUID = -9194351212331473960L;

    private Integer id;
    private Integer ruleLevel;
    private String ruleName;

    //    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    //    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
}
