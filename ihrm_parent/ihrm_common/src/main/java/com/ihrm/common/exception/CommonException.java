package com.ihrm.common.exception;
/**
 * @Description TODO
 * @Date 2021/7/11
 * @Created by MINGKU
 */
import com.ihrm.common.entity.ResultCode;
import lombok.Getter;

/**
 * 自定义异常
 */
@Getter
public class CommonException extends Exception  {

    private ResultCode resultCode;

    public CommonException(ResultCode resultCode) {
        this.resultCode = resultCode;
    }
}
