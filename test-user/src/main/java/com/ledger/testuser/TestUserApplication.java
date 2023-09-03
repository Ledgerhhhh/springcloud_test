package com.ledger.testuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@RefreshScope
@MapperScan("com.ledger.testuser.mapper")
@SpringBootApplication
@ComponentScan(basePackages = {
                "com.ledger.testuser",
                "com.ledger.testfeignapi",
                "com.ledger.testcommon",
                })
public class TestUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestUserApplication.class, args);
    }

}
