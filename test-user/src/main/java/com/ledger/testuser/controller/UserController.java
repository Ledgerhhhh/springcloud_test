package com.ledger.testuser.controller;

import com.ledger.testcommon.exception.AppExceptionCodeMsg;
import com.ledger.testcommon.exception.KnowException;
import com.ledger.testuser.domain.User;
import com.ledger.testuser.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        throw new KnowException(AppExceptionCodeMsg.USER_AUTHENTICATION_NO_USER);
    }

    @GetMapping("/getUser")
    public List<User> getUser() {
        return userService.list();
    }

}
