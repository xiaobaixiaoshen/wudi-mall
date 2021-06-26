package com.langke.wudimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LangKe
 * @description
 * @date 2021/6/26 14:47
 */
@MapperScan("com.langke.wudimall.coupon.dao")
@SpringBootApplication
public class WudimallCouponApplication {
    public static void main(String[] args){
        SpringApplication.run(WudimallCouponApplication.class, args);
    }
}
