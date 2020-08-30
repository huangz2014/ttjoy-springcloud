package org.ttjoy.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoConsulServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoConsulServer1Application.class, args);
    }

}
