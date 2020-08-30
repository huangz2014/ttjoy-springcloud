package org.ttjoy.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value = "/demo")
    public String info(String s){
        return "string=" + s +" 这是第一个微服务";
    }
}
