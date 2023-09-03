package com.ledger.testuser.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ledger.testuser.domain.User;
import com.ledger.testuser.mapper.UserMapper;
import com.ledger.testuser.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

}
