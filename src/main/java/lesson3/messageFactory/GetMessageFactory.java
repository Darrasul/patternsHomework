package lesson3.messageFactory;

import lesson3.messages.GetMessage;
import lesson3.messages.Message;

public class GetMessageFactory extends MessageFactory{
    @Override
    public Message getMessage(String data) {
        return new GetMessage(data);
    }
}
