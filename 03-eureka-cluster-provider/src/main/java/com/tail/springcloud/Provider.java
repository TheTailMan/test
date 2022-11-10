package com.tail.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //激活eurekaclient
public class Provider {

    public static void main(String[] args) {
        SpringApplication.run(Provider.class, args);
    }

}
