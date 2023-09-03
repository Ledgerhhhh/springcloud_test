package com.ledger.testfeignapi.config;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DefaultFeignConfiguration {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule ribbonRule(){
        //默认轮询
        RoundRobinRule roundRobinRule = new RoundRobinRule();
        //随机询问
        RandomRule randomRule = new RandomRule();
        //轮询+重试
        RetryRule retryRule = new RetryRule();
        //根据相应时间来判断权重
        WeightedResponseTimeRule weightedResponseTimeRule = new WeightedResponseTimeRule();
        //区域内轮询
        ZoneAvoidanceRule zoneAvoidanceRule = new ZoneAvoidanceRule();
        //选择最低并发实例
        BestAvailableRule bestAvailableRule = new BestAvailableRule();
        //排除故障和超时的实例
        AvailabilityFilteringRule availabilityFilteringRule = new AvailabilityFilteringRule();
        return randomRule;
    }
}
