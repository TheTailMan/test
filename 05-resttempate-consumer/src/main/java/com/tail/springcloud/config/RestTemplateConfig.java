package com.tail.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 作者:admin
 * 时间:2022/11/9
 * 版本:
 * 功能:com.tail.springcloud.config
 * Web后端springcloud
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate getRest(){
        return new RestTemplate();
    }
}
