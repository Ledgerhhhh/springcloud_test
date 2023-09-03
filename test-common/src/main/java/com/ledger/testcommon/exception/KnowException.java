package com.ledger.testcommon.exception;


import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(callSuper = false)
public class KnowException extends RuntimeException{

    private int code;

    private String msg;
    public KnowException(AppExceptionCodeMsg appExceptionCodeMsg) {
        this.code = appExceptionCodeMsg.getCode();
        this.msg = appExceptionCodeMsg.getMsg();
    }

    public KnowException(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }
}

