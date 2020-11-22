package com.example.template;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 指定扫描的Mapper接口路径，可以指定多个
@MapperScan(basePackages = "com.example.template.mapper")
public class SpringbootMybatisTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisTemplateApplication.class, args);
    }

}
