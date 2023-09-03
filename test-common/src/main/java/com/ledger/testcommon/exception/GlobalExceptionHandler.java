package com.ledger.testcommon.exception;


import com.ledger.testcommon.RO.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {Exception.class}) //@ExceptionHandler注解声明了全局异常处理类中对异常处理的方法
    public <T> Result<T> exceptionHandler(Exception e){
        //对出现的异常进行判断，根据不同类型的异常进行不同方式的处理
        //此处为判断拦截到的Exception是不是我们自定义的异常类型
        if(e instanceof KnowException){
            KnowException appException = (KnowException)e;
            return Result.error(appException.getCode(),appException.getMsg());
        }
        //如果拦截的异常不是我们自定义的异常（非业务相关的异常）,则返回服务器异常
        return Result.error(500,"服务器异常");
    }
}