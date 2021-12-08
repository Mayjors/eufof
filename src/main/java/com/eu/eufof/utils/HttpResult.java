package com.eu.eufof.utils;

import lombok.Data;

@Data
public class HttpResult <T>{
    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体的内容. */
    private T data;
}
