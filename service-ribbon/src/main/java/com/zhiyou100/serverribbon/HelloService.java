/**
 * Copyright (C), 2009-2019, 智游集团
 * FileName: HelloService
 * Author:   laosun
 * Date:     2019/11/22 3:11 下午
 * Description:
 */
package com.zhiyou100.serverribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service

public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public  String helloService(String name){

        return restTemplate.getForObject("http://server-hello/hello.action?name="+name,String.class);
    }

    public String helloError(String name){

        return name + "error";
    }

}
