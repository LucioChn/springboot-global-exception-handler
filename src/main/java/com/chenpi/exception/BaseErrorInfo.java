package com.chenpi.exception;

/**
 * 自定义异常信息接口，自定义的异常信息枚举类需实现该接口。
 *
 * @author 陈皮
 * @version 1.0
 * @date 2021/12/30
 */
public interface BaseErrorInfo {

  /**
   * 获取错误码
   *
   * @return 错误码
   */
  String getErrorCode();

  /**
   * 获取错误信息
   *
   * @return 错误信息
   */
  String getErrorMsg();
}