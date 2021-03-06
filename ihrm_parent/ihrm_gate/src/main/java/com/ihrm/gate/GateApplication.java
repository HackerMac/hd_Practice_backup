package com.ihrm.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Description TODO
 * @Date 2021/7/11
 * @Created by MINGKU
 */
@SpringBootApplication(scanBasePackages = "com.ihrm" , exclude = {DataSourceAutoConfiguration.class})
//开启zuul网关功能
@EnableZuulProxy
//开启服务发现功能
@EnableDiscoveryClient
public class GateApplication {

    public static void main(String[] args) {
        SpringApplication.run(GateApplication.class);
    }
}
