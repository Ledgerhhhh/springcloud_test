package com.ledger.testdatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TestDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestDatasourceApplication.class, args);
    }

}
