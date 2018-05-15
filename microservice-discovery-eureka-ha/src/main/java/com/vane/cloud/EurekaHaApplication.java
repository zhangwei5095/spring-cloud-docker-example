package com.vane.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author Vane
 * @Date 2018年05月14日
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaHaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHaApplication.class, args);
    }
}
