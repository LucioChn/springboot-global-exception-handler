package com.chenpi.exception;

import lombok.Getter;

/**
 * 自定义通用异常信息枚举类
 *
 * @author 陈皮
 * @version 1.0
 * @date 2021/12/30
 */
@Getter
public enum CommonErrorEnum implements BaseErrorInfo {

  /**
   * 成功
   */
  SUCCESS("200", "成功!"),
  /**
   * 请求的数据格式不符!
   */
  BODY_NOT_MATCH("400", "请求的数据格式不符!"),
  /**
   * 未找到该资源!
   */
  NOT_FOUND("404", "未找到该资源!"),
  /**
   * 服务器内部错误!
   */
  INTERNAL_SERVER_ERROR("500", "服务器内部错误!"),
  /**
   * 服务器正忙，请稍后再试!
   */
  SERVER_BUSY("503", "服务器正忙，请稍后再试!");

  private final String errorCode;
  private final String errorMsg;

  CommonErrorEnum(String errorCode, String errorMsg) {
    this.errorCode = errorCode;
    this.errorMsg = errorMsg;
  }
}