package com.ledger.testproduct;

import com.netflix.loadbalancer.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@EnableHystrix
@SpringBootApplication
@EnableFeignClients(basePackages = "com.ledger.testfeignapi.client")
@ComponentScan(basePackages = {
        "com.ledger.testproduct",
        "com.ledger.testfeignapi",
        "com.ledger.testcommon",
})
public class TestProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestProductApplication.class, args);
    }
}
