package com.ledger.testfeignapi.domain;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("spring_cloud_test")
public class User {
    @TableId
    private String id;
    private String userName;
    private int age;
    private boolean gender;
}
