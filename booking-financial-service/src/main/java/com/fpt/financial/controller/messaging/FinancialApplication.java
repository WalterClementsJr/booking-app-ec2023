package com.fpt.financial.controller.messaging;

import com.fpt.financial.entity.CustomerPoint;
import com.fpt.financial.service.CustomerPointService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class FinancialApplication {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final CustomerPointService customerPointService;

    @Bean
    public NewTopic roomTopic() {
        return TopicBuilder.name("room")
            .partitions(3)
            .compact()
            .build();
    }

    @Bean
    public NewTopic userTopic() {
        return TopicBuilder.name("room")
            .partitions(3)
            .compact()
            .build();
    }


    @KafkaListener(id = "orders", topics = "orders", groupId = "payment")
    public void onEvent(CustomerPoint o) {
        log.info("Received: {}", o);
//        kafkaTemplate.send()
        // TODO: add logic here
    }
}
