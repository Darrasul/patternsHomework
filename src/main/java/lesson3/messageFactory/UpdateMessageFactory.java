package lesson3.messageFactory;

import lesson3.messages.Message;
import lesson3.messages.UpdateMessage;

public class UpdateMessageFactory extends MessageFactory{
    @Override
    public Message getMessage(String data) {
        return new UpdateMessage(data);
    }
}
