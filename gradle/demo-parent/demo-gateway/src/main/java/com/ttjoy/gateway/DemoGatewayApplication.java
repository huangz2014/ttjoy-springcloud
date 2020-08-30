package com.ttjoy.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGatewayApplication.class, args);
    }


    /**
     * RoutePredicateFactory
     * BeforeRoutePredicateFactory                      请求时间满足在配置时间之后
     * AfterRoutePredicateFactory                       请求时间满足在配置时间之前
     * BetweenRoutePredicateFactory                     请求时间满足在配置之间
     * CookieRoutePredicateFactory                      请求指定Cookie正则匹配指定值
     * HeaderRoutePredicateFactory                      请求指定Header正则匹配指定值
     * CloudFoundryRouteServiceRoutePredicateFactory    请求Headers是否包含指定名称
     * HostRoutePredicateFactory                        请求host匹配指定值
     * MethodRoutePredicateFactory                      请求Method匹配配置的method
     * PathRoutePredicateFactory                        请求路径正则匹配指定值
     * QueryRoutePredicateFactory                       查询请求参数正则匹配指定值
     * RemoteAddrRoutePredicateFactory                  请求远程地址匹配指定值
     * @param builder
     * @return

    @Bean
    public RouteLocator customerRouterLocator(RouteLocatorBuilder builder){
        System.out.println("123");
        return builder.routes()
//                .route("path_route",r -> r.path("/").uri("http://localhost:8080/demo/info"))
                .route("path_route",r -> r.path("/demo/**").uri("lb://server/demo"))
//                .route("path_route",r -> r.path("/").uri("https://www.baidu.com"))
                .build();
    }
     */

}
