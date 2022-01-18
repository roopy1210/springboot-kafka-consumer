package com.roopy.consumer;

import com.roopy.config.KafkaProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConsumerService {

    @KafkaListener(topics = {"testTopic"}, groupId = KafkaProperties.CONSUMER_GROUP_ID)
    public void consumerMessage(String message) {
        log.info("Received Message : {}", message);
    }

}
