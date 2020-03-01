package com.hoodee.communitycontroll;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.hoodee.communitycontroll.mapper")
@SpringBootApplication
public class CommunitycontrollApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommunitycontrollApplication.class, args);
    }

}
