package lesson3.messageFactory;

import lesson3.messages.EndMessage;
import lesson3.messages.Message;

public class EndMessageFactory extends MessageFactory{
    @Override
    public Message getMessage(String data) {
        return new EndMessage(data);
    }
}
