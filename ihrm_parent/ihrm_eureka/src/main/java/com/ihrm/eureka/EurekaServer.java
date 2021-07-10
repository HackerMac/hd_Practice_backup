package com.ihrm.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description TODO
 * @Date 2021/7/11
 * @Created by MINGKU
 */
@SpringBootApplication
@EnableEurekaServer //开启Eureka服务端配置
public class EurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class , args);
    }
}
