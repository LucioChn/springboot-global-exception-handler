package com.nobody.exception;

import lombok.Getter;
import lombok.Setter;
import org.slf4j.MDC;

/**
 * @Description 自定义业务异常类
 * @Author Mr.nobody
 * @Date 2020/10/23
 * @Version 1.0
 */
@Getter
@Setter
public class BizException extends RuntimeException {

    private static final long serialVersionUID = 5564446583860234738L;

    // 错误码
    private String errorCode;
    // 错误信息
    private String errorMsg;
    // 日志追踪ID
    private String traceId = MDC.get("traceId");

    public BizException(BaseErrorInfo errorInfo) {
        super(errorInfo.getErrorMsg());
        this.errorCode = errorInfo.getErrorCode();
        this.errorMsg = errorInfo.getErrorMsg();
    }

    public BizException(BaseErrorInfo errorInfo, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorInfo.getErrorCode();
        this.errorMsg = errorMsg;
    }

    public BizException(BaseErrorInfo errorInfo, Throwable cause) {
        super(errorInfo.getErrorMsg(), cause);
        this.errorCode = errorInfo.getErrorCode();
        this.errorMsg = errorInfo.getErrorMsg();
    }

    public BizException(String errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public BizException(String errorCode, String errorMsg, Throwable cause) {
        super(errorMsg, cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
