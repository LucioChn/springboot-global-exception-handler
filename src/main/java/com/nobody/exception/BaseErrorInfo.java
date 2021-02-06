package com.nobody.exception;

/**
 * @Description 自定义异常基础接口类，自定义的异常枚举类需实现该接口。
 * @Author Mr.nobody
 * @Date 2021/2/6
 * @Version 1.0
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
