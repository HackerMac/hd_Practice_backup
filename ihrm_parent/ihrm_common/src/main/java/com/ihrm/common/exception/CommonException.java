package com.ihrm.common.exception;

/**
 * @Classname CommonException
 * @Description TODO
 * @Date 2021/7/8 19:04
 * @Created by MINGKU
 */

import com.ihrm.common.entity.ResultCode;
import lombok.Getter;

/**
 * 自定义异常
 */
@Getter
public class CommonException extends Exception{
    private ResultCode resultCode;

    public CommonException(ResultCode resultCode) {
        this.resultCode = resultCode;
    }
}
