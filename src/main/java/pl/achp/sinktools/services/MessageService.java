package pl.achp.sinktools.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import pl.achp.sinktools.model.Message;
import pl.achp.sinktools.config.KafkaProperties;

@Service
public class MessageService {

    private static final Logger logger = LoggerFactory.getLogger(MessageService.class);

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;


    @Autowired
    private KafkaProperties kafkaProperties;

    public void sendMessage(Message message) {
        logger.info("Sending message: {} | {}", kafkaProperties.getTopicName(), message);
//        kafkaTemplate.send(kafkaProperties.getTopicName(), message);
    }
}
