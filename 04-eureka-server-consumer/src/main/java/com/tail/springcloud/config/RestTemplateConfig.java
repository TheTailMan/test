package com.tail.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 作者:admin
 * 时间:2022/11/8
 * 版本:
 * 功能:com.tail.springcloud.config
 * Web后端springcloud
 * 注解这是一个配置
 */
@Configuration
public class RestTemplateConfig {

    /**
     * 把RestTemplate类定义到spring的容器中
     * @LoadBalanced 表示支持Ribbon的均衡负载
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
