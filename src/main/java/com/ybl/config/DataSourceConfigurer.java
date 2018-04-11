package com.ybl.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * Created by duanwj on 2018/4/10 0010 20:48
 */
@Configuration
public class DataSourceConfigurer {
    @Primary
    @Bean(name = "primaryDataSource")//装配该方法返回值为yblDataSource管理bean
    @Qualifier("primaryDataSource")//spring装配bean唯一标识
    @ConfigurationProperties(prefix = "spring.datasource.primary")//application.yml文件内配置数据源的前缀
    public DruidDataSource primaryDataSource() {

        return new DruidDataSource();
    }

    @Bean(name = "secondaryDataSource")
    @Qualifier("secondaryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.secondary")
    public DataSource secondaryDataSource() {

        return DataSourceBuilder.create().build();
    }
}
