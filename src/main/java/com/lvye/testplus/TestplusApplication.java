package com.lvye.testplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lvye.testplus.mapper") // 扫描Mapper接口
public class TestplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestplusApplication.class, args);
    }

}
