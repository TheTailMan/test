package com.tail.springcloud.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 作者:admin
 * 时间:2022/11/8
 * 版本:
 * 功能:com.tail.springcloud.controller
 * Web后端springcloud
 */
@RestController
public class ConsumerController {
    /**
     * 定义一个Rest模板工具类，要爆发这个类可以以http协议访问任何http服务
     * 这个类是spring 提供的，但是默认没有在上下文中，要手动配置
     * RestTemplateConfig自定义个类参考
     */
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public Object test(){
        /** getForEntity方法是使用http协议 以get请求访问一个具体的服务
         * 参数1：是请求访问的路径
         * 参数2：为响应封装的格式
         *  ResponseEntity 是响应的接收对象，用这个对象可以获取响应的编码，响应头，以及具体的响应信息
         *   注意：
         *       如果服务的提供者返回一个基本数据类型或string引用类型，参数2 写成基本数据类型.class
         *       如果服务提供者返回的是json格式的，可以用实体类或Map集合封装响应数据
         *       如果服务提供者返回的是json格式数组，可以使用List或set集合来封装响应数据
         *
         *       ResponseEntity的泛型决定我们从服务提供者得到的数据类型，参数2和泛型一致
         */

        String url="http://localhost:8082/test";
        ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);
        HttpStatus statusCode = forEntity.getStatusCode();//获取响应状态码和状态信息
        System.out.println(statusCode);
        int statusCodeValue = forEntity.getStatusCodeValue();//获取响应状态信息
        System.out.println(statusCodeValue);
        HttpHeaders headers = forEntity.getHeaders();//获取响应头
        System.out.println(headers);
        String body = forEntity.getBody();//获取具体响应
        return "springcloud第一个消费者"+body;
    }
}
