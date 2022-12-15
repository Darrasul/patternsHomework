package lesson3.messageFactory;

import lesson3.messages.DeleteMessage;
import lesson3.messages.Message;

public class DeleteMessageFactory extends MessageFactory{
    @Override
    public Message getMessage(String data) {
        return new DeleteMessage(data);
    }
}
