package com.clouds.fun.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Raki-star
 * @version 1.0.0
 * @ClassName ServerApplication.java
 * @Description TODO
 * @createTime 2020年01月11日 10:02:00
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplication.class,args);
    }
}
