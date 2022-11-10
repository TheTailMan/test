package com.tail.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者:admin
 * 时间:2022/11/8
 * 版本:
 * 功能:com.tail.springcloud.controller 生产者提供json
 * Web后端springcloud
 */
@RestController
public class ProviderController {
    @RequestMapping("/test")
    public Object test(){
        return "服务提供者";
    }
}
