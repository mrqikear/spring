package com.lqbs.mriq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MriqApplication {

    public static void main(String[] args) {
        SpringApplication.run(MriqApplication.class, args);
    }

}
