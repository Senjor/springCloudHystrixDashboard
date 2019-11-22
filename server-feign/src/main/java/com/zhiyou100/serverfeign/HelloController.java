/**
 * Copyright (C), 2009-2019, 智游集团
 * FileName: HelloController
 * Author:   laosun
 * Date:     2019/11/22 6:36 下午
 * Description:
 */
package com.zhiyou100.serverfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hello.action")
    public  String sayHello(String name){
        return helloService.sayHello(name);
    }
}
