package com.json.wechat.config.dao;

import org.apache.commons.dbcp2.BasicDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.InputStream;
import java.util.Properties;

@Configuration
@MapperScan("com.json.wechat.dao")
public class DataSourceConfiguration {
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("jdbc.username")
    private String jdbcUsername;
    @Value("jdbc.password")
    private String jdbcPassword;

    @Bean(name = "dataSource")
    public BasicDataSource createDataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(jdbcUrl);
        basicDataSource.setDriverClassName(jdbcDriver);
        basicDataSource.setUsername(jdbcUsername);
        basicDataSource.setPassword(jdbcPassword);
        basicDataSource.setDefaultAutoCommit(false);
        return basicDataSource;
    }
}
