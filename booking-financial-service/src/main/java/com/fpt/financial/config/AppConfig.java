package com.fpt.financial.config;

import com.fpt.common.dto.user.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class AppConfig {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Bean
    public CommandLineRunner run() {
        return args -> {
            UserDto userDto = new UserDto();
            userDto.setName("John Wayne");
            kafkaTemplate.send("topic-one", "123", userDto);
        };
    }
}
