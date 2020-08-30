package org.ttjoy.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/demo")
    public String Hello(String name){
        return "你好！" + name + ",这是第二个微服务。";
    }
}
