package lesson3.messageFactory;

import lesson3.messages.CreateMessage;
import lesson3.messages.Message;

public class CreateMessageFactory extends MessageFactory{
    @Override
    public Message getMessage(String data) {
        return new CreateMessage(data);
    }
}
