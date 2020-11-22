package com.example.template.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Dozer全局配置
 * @author NULL
 * @since 2020-11-22
 */
@Configuration
public class DozerConfig {

    @Bean
    public DozerBeanMapper dozerBeanMapper(){
        return new DozerBeanMapper();
    }
}
