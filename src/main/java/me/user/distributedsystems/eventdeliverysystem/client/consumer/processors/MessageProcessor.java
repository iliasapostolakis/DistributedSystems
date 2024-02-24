package me.user.distributedsystems.eventdeliverysystem.client.consumer.processors;

import me.user.distributedsystems.eventdeliverysystem.client.consumer.domain.Topic;
import me.user.distributedsystems.eventdeliverysystem.common.message.Message;

public abstract class MessageProcessor {

    protected final Topic topic;

    public MessageProcessor(Topic topic) {
        this.topic = topic;
    }
    public abstract void process(Message message);
}
