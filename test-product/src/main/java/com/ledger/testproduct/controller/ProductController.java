package com.ledger.testproduct.controller;

import com.ledger.testfeignapi.domain.User;
import com.ledger.testfeignapi.client.userClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RefreshScope
@Slf4j
@RequestMapping("/product")
public class ProductController {

    @Value("${ledger}")
    private String ledger;
    @Resource
    private userClient userClient;

    //配置降级方法
    @HystrixCommand(
            fallbackMethod = "timeOutInvoke",
            commandProperties = {
            //设置服务调用超时10秒时触发服务降级
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "10000")
    })
    @GetMapping("/hello")
    public String invoke(){
        List<User> user = userClient.getUser();
        return user.toString();
    }

    public String timeOutInvoke() {
        return "系统繁忙，请稍后再试";
    }
}
