package me.user.distributedsystems.eventdeliverysystem.client.consumer.processors;

import me.user.distributedsystems.eventdeliverysystem.client.consumer.domain.Topic;
import me.user.distributedsystems.eventdeliverysystem.common.message.Message;
import me.user.distributedsystems.eventdeliverysystem.common.message.UpdateMessage;

public class UpdateMessageProcessor extends MessageProcessor {
    public UpdateMessageProcessor(Topic topic) {
        super(topic);
    }

    @Override
    public void process(Message message) {
        UpdateMessage updateMessage = (UpdateMessage) message;
    }
}
