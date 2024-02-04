package com.yixian.yixianojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;


@MapperScan("com.yixian.yixianojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@SpringBootApplication
@ComponentScan("com.yixian")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.yixian.yixianojbackendserviceclient.service"})
public class YixianojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YixianojBackendUserServiceApplication.class, args);
    }

}
