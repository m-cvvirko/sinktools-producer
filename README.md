# sinktools-producer

### usage:
http://localhost:8080/api/messages

> curl -X POST http://localhost:8080/api/messages \
-H "Content-Type: application/json" \
-d '{"id": 1, "timestamp": "2020-01-01T00:00:00Z", "message": "Hello Kafka"}'