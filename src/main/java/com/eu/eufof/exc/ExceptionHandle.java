package com.eu.eufof.exc;

import com.eu.eufof.utils.HttpResult;
import com.eu.eufof.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public HttpResult handle(Exception e) {
        if (e instanceof MyException) {   //判断异常是否是我们定义的异常
            MyException exception = (MyException) e;
            return ResultUtil.error(exception.getCode(), exception.getMessage());
        }else {
            logger.error("【系统异常】{}", e);
            return ResultUtil.error(-1, "未知错误");
        }
    }
}

