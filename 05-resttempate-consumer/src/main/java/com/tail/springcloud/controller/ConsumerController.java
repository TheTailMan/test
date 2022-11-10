package com.tail.springcloud.controller;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;
import com.tail.springcloud.bean.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 作者:admin
 * 时间:2022/11/9
 * 版本:
 * 功能:com.tail.springcloud.controller
 * Web后端springcloud
 */
@RestController
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/test01")
    public Object getUser(){
        String url="http://localhost:8082/test";
        ResponseEntity<User> forEntity = restTemplate.getForEntity(url, User.class);
        User body = forEntity.getBody();
        return body;
    }
}
