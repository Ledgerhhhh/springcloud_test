package com.ledger.testcommon.RO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {

    /**
     * 服务端返回的状态码
     */
    private int code;
    /**
     * 服务端返回的信息
     */
    private String msg;
    /**
     * 服务端返回的数据
     */
    private T data;

    public static <T> Result<T> success(T data){
        return new Result<T>(200, "success", data);
    }

    public static <T> Result<T> success(String msg,T data){
        return new Result<T>(200,msg, data);
    }

    public static <T> Result<T> error(int code,String msg){
        return new Result<T>(code,msg, null);
    }
}