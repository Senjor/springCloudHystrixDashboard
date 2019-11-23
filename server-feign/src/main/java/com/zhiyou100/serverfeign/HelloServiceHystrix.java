/**
 * Copyright (C), 2009-2019, 智游集团
 * FileName: HelloServiceHystirx
 * Author:   laosun
 * Date:     2019/11/23 8:55 上午
 * Description:
 */
package com.zhiyou100.serverfeign;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystrix implements HelloService{


    @Override
    public String sayHello(String name) {
        return name + "error";
    }
}
