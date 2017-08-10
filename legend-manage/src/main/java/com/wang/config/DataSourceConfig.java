package com.wang.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DataSourceConfig {
    private Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);

    @Value("${mysql.url}")
    private String dbUrl;
    @Value("${mysql.username}")
    private String username;
    @Value("${mysql.password}")
    private String password;
    @Value("${mysql.driverClassName}")
    private String driverClassName;
    @Value("${mysql.initialSize}")
    private int initialSize;
    @Value("${mysql.minIdle}")
    private int minIdle;
    @Value("${mysql.maxActive}")
    private int maxActive;
    @Value("${mysql.maxWait}")
    private int maxWait;
    @Value("${mysql.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;
    @Value("${mysql.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;
    @Value("${mysql.testWhileIdle}")
    private boolean testWhileIdle;
    @Value("${mysql.filters}")
    private String filters;
    @Value("${mysql.connectionProperties}")
    private String connectionProperties;

    @Bean
    @Primary
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setInitialSize(initialSize);
        dataSource.setMinIdle(minIdle);
        dataSource.setMaxActive(maxActive);
        dataSource.setMaxWait(maxWait);
        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        dataSource.setTimeBetweenConnectErrorMillis(timeBetweenEvictionRunsMillis);
        dataSource.setTestWhileIdle(testWhileIdle);
        try {
            dataSource.setFilters(filters);
        } catch (SQLException e) {
           logger.error("连接池设置日志组件失败，原因：【{}】", e.getMessage());
        }
        dataSource.setConnectionProperties(connectionProperties);
        return dataSource;
    }

}
