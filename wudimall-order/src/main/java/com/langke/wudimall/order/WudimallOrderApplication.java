package com.langke.wudimall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LangKe
 * @description
 * @date 2021/6/26 14:47
 */
@MapperScan("com.langke.wudimall.order.dao")
@SpringBootApplication
public class WudimallOrderApplication {
    public static void main(String[] args){
        SpringApplication.run(WudimallOrderApplication.class, args);
    }
}
