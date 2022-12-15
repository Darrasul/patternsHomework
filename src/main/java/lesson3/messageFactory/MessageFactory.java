package lesson3.messageFactory;

import lesson3.messages.Message;

public abstract class MessageFactory {

    public abstract Message getMessage(String data);
}
