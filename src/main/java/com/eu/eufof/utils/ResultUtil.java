package com.eu.eufof.utils;

public class ResultUtil<T> {
    public static HttpResult success(Object object) {
        HttpResult result = new HttpResult();
        result.setCode(0);
        result.setMsg("success");
        result.setData(object);
        return result;
    }

    public static HttpResult success() {
        return success(null);
    }

    public static HttpResult error(Integer code, String msg) {
        HttpResult result = new HttpResult();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
