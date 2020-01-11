package com.clouds.fun.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Raki-star
 * @version 1.0.0
 * @ClassName SearchApplication.java
 * @Description TODO
 * @createTime 2020年01月11日 10:20:00
 */
@SpringBootApplication
@EnableSwagger2
public class SearchApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplication.class,args);
    }
}
