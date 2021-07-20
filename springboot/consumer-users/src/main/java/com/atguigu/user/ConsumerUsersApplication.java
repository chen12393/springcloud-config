package com.atguigu.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient  // 开启发现服务功能
public class ConsumerUsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerUsersApplication.class, args);
    }
   @Bean
   @LoadBalanced // 启用负载均衡机制
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
