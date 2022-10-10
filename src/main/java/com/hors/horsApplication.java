package com.hors;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hors.mappers")   // 扫描mapper接口所在的包
@SpringBootApplication    // springboot的应用程序

public class horsApplication {
    public static void main(String[] args) {
        SpringApplication.run(horsApplication.class,args);
    }
}
