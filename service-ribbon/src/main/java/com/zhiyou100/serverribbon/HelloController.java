/**
 * Copyright (C), 2009-2019, 智游集团
 * FileName: HelloController
 * Author:   laosun
 * Date:     2019/11/22 3:14 下午
 * Description:
 */
package com.zhiyou100.serverribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hello.action")
    public  String hello(@RequestParam String name){
        return helloService.helloService(name);
    }

}
