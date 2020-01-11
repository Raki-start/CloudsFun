package com.clouds.fun.comment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Raki-star
 * @version 1.0.0
 * @ClassName CommentApplication.java
 * @Description TODO
 * @createTime 2020年01月11日 10:22:00
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.clouds.fun.comment.dao")
public class CommentApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommentApplication.class,args);
    }
}
