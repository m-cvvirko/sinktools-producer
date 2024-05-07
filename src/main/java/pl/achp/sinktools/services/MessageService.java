package pl.achp.sinktools.services;

import pl.achp.sinktools.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

    public void sendMessage(Message message) {
        System.out.println("Sending message: " + message);
//        kafkaTemplate.send("topic-name", message);
    }
}
