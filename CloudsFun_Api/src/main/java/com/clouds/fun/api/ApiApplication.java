package com.clouds.fun.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Raki-star
 * @version 1.0.0
 * @ClassName ApiApplication.java
 * @Description TODO
 * @createTime 2020年01月11日 10:05:00
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@EnableFeignClients
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class,args);
    }
}
