package com.ledger.testuser.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ledger.testuser.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
