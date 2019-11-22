/**
 * Copyright (C), 2009-2019, 智游集团
 * FileName: HelloService
 * Author:   laosun
 * Date:     2019/11/22 6:34 下午
 * Description:
 */
package com.zhiyou100.serverfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("server-hello")//对应的是service的名字
public interface HelloService {

    @RequestMapping(value = "/hello.action")
    String sayHello(@RequestParam("name") String name);
}
