package com.hz.m02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.hz.m02.dao")
public class M02Application {

    public static void main(String[] args) {
        SpringApplication.run( M02Application.class, args );
    }

}
