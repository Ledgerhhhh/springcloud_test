package com.ledger.testcommon.exception;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 异常的美剧
 */
@Getter
public enum AppExceptionCodeMsg {
    INVALID_CODE(10000,"验证码无效"),
    USERNAME_NOT_EXISTS(10001,"用户不存在"),
    USER_LOGIN_ACCOUNT(10002,"用户名或者密码错误"),
    USER_PERMISSION_NOT_ENOUTH(10003,"用户权限不足"),
    USER_EMPTY(10004,"用户名为空"),
    USER_EXISTS(10006,"用户名已存在"),
    USER_DELETE_FAIL(11001,"删除失败"),
    USER_REGISTER_FAIL(11000,"用户注册失败"),
    USER_AUTHENTICATION_NO_TOKEN(401,"Token为空"),
    USER_AUTHENTICATION_NO_USER(401,"用户不存在"),
    USER_AUTHENTICATION_TOKEN_EXPIRE(401,"token已过期"),
    USER_AUTHENTICATION_TOKEN_FAILED(401,"token验证失败");

    private final int code ;
    private final String msg ;

    AppExceptionCodeMsg(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

}