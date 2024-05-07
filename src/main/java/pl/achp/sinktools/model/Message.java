package pl.achp.sinktools.model;

import java.time.Instant;
import java.util.Objects;

public class Message {
    private Long id;
    private Instant timestamp;
    private String message;

    public Message() {
    }

    public Message(String message, Instant timestamp, Long id) {
        this.message = message;
        this.timestamp = timestamp;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return Objects.equals(id, message1.id) && Objects.equals(timestamp, message1.timestamp) && Objects.equals(message, message1.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, timestamp, message);
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", timestamp=" + timestamp +
                ", message='" + message + '\'' +
                '}';
    }

}

