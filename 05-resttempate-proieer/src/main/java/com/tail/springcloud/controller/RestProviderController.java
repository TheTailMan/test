package com.tail.springcloud.controller;

import com.tail.springcloud.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者:admin
 * 时间:2022/11/9
 * 版本:
 * 功能:com.tail.springcloud.controller
 * Web后端springcloud
 */
@RestController
public class RestProviderController {

    @RequestMapping("/test")
    public Object test(){
        /**
         * 这里返回的是以json格式的字符串，
         *
         * 传输到下个项目中的是一个字符串
         */
        return new User("张三",25);
    }
}
