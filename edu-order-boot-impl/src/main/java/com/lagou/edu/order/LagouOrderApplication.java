package com.lagou.edu.order;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.baomidou.mybatisplus.autoconfigure.MybatisPlusAutoConfiguration;
import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * LagouOrderApplication
 *
 * @author xianhongle
 * @data 2022/6/3 22:16
 **/

@SpringBootApplication(exclude = {
        DruidDataSourceAutoConfigure.class,
        DataSourceAutoConfiguration.class,
        MybatisPlusAutoConfiguration.class
})
@EnableConfigurationProperties
@EnableAutoDataSourceProxy
@EnableDiscoveryClient
@ComponentScan("com.lagou.edu")
@EnableFeignClients("com.lagou.edu")
@MapperScan("com.lagou.edu.order.mapper")
@Slf4j
public class LagouOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(LagouOrderApplication.class,args);
    }

}
