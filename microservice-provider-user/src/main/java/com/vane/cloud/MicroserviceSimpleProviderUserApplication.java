package com.vane.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Vane
 * @Date 2018年05月14日
 */
@SpringBootApplication
@EnableEurekaClient
public class MicroserviceSimpleProviderUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleProviderUserApplication.class, args);
    }
}
