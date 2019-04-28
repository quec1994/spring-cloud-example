package com.quec1994;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: ConsumerApplication
 * <p>Description: 服务消费者示例启动类
 *
 * @author quec1994
 * @version V1.0, 2019/4/25
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    /***
     * 配置RestTemplate
     *
     * @return RestTemplate
     * @author V1.0, quec1994, 2019/4/28 17:26
     **/
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
