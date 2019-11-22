package com.zhiyou100.serverhello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServerHelloApplication {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello.action")
    public  String sayHello(@RequestParam(value = "name",defaultValue = "xiaoming") String name){

        return "my name is:" + name +", port is : " + port;
    }

    public static void main(String[] args) {
        SpringApplication.run(ServerHelloApplication.class, args);
    }

}
