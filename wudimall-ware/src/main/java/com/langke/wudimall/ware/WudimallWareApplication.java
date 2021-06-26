package com.langke.wudimall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LangKe
 * @description
 * @date 2021/6/26 14:47
 */
@MapperScan("com.langke.wudimall.ware.dao")
@SpringBootApplication
public class WudimallWareApplication {
    public static void main(String[] args){
        SpringApplication.run(WudimallWareApplication.class, args);
    }
}
