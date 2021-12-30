package com.chenpi.exception;

import lombok.Getter;

/**
 * 自定义用户相关异常信息枚举类
 *
 * @author 陈皮
 * @version 1.0
 * @date 2021/12/30
 */
@Getter
public enum UserErrorEnum implements BaseErrorInfo {

  /**
   * 用户不存在
   */
  USER_NOT_FOUND("1001", "用户不存在!");

  private final String errorCode;
  private final String errorMsg;

  UserErrorEnum(String errorCode, String errorMsg) {
    this.errorCode = errorCode;
    this.errorMsg = errorMsg;
  }
}