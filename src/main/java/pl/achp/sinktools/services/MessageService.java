package pl.achp.sinktools.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import pl.achp.sinktools.model.Message;
import pl.achp.sinktools.config.KafkaProperties;

@Service
public class MessageService {

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

//    @Value("${achp.kafka.topic.name}")
//    private String topicName;

    @Autowired
    private KafkaProperties kafkaProperties;

    public void sendMessage(Message message) {
        System.out.println("Sending message: " + kafkaProperties.getTopicName() + " | " + message);
        kafkaTemplate.send(kafkaProperties.getTopicName(), message);
    }
}
