package lesson3.messages;

public class EndMessage extends Message{
    public EndMessage(String data) {
        setData(data);
        setType(MessageType.END);
    }
}
