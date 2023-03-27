package com.fpt.financial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class FinancialServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(FinancialServiceApplication.class, args);
    }
}
