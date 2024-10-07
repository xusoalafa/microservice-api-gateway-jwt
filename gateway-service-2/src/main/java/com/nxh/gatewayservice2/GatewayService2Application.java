package com.nxh.gatewayservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayService2Application {

    public static void main(String[] args) {
        SpringApplication.run(GatewayService2Application.class, args);
    }

}
