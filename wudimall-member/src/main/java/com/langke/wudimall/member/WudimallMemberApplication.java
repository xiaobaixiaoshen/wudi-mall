package com.langke.wudimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author LangKe
 * @description
 * @date 2021/6/26 14:47
 */
@EnableFeignClients(basePackages = "com.langke.wudimall.member.feign")
@EnableDiscoveryClient
@MapperScan("com.langke.wudimall.member.dao")
@SpringBootApplication
public class WudimallMemberApplication {
    public static void main(String[] args){
        SpringApplication.run(WudimallMemberApplication.class, args);
    }
}
