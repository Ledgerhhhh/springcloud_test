package com.ledger.testuser.config;

import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@RefreshScope
@Slf4j
@Primary
public class DatabaseConfig {
    @Value("${ledger.datasource.driver-class-name}")
    public String className;
    @Value("${ledger.datasource.url}")
    public String url;
    @Value("${ledger.datasource.username}")
    public String username;
    @Value("${ledger.datasource.password}")
    public String password;
    @Value("${ledger.datasource.druid.initial-size}")
    public int initialSize;
    @Value("${ledger.datasource.druid.min-idle}")
    public int minIdle;
    @Value("${ledger.datasource.druid.max-active}")
    public int maxActive;
    @Value("${ledger.datasource.druid.max-wait}")
    public int maxWait;


    @Bean
    public HikariDataSource dataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName(className);
        dataSource.setJdbcUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        // 配置HikariCP连接池参数（可选）
        dataSource.setMinimumIdle(minIdle);
        dataSource.setMaximumPoolSize(maxActive); // 最大连接池大小
        dataSource.setConnectionTimeout(maxWait); // 连接超时时间
        dataSource.setInitializationFailTimeout(initialSize);
        return dataSource;
    }
}
