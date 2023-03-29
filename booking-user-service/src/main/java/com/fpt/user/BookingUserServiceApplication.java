package com.fpt.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class BookingUserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookingUserServiceApplication.class, args);
    }
}
