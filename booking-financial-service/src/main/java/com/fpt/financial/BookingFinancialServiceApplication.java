package com.fpt.financial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;


@SpringBootApplication
@EnableKafka
public class BookingFinancialServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookingFinancialServiceApplication.class, args);
    }
}
