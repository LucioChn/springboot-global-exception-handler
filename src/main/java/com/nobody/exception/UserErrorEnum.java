package com.nobody.exception;

import lombok.Getter;

/**
 * @Description 自定义用户相关异常枚举类
 * @Author Mr.nobody
 * @Date 2020/10/23
 * @Version 1.0
 */
@Getter
public enum UserErrorEnum implements BaseErrorInfo {

    /**
     * 用户不存在
     */
    USER_NOT_FOUND("1001", "用户不存在!");

    private String errorCode;
    private String errorMsg;

    UserErrorEnum(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
