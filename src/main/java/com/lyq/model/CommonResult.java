package com.lyq.model;

/**
 * @Author liuyiqiang
 * @Date 2018/9/2 16:01
 * @Version 1.0
 */
public class CommonResult {
    protected Integer errorCode;
    protected String errorMsg;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
