package com.fpt.apigw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@EnableEurekaClient
@ConfigurationPropertiesScan
public class BookingApiGw {
    public static void main(String[] args) {
        SpringApplication.run(BookingApiGw.class, args);
    }
}