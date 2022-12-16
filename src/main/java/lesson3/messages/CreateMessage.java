package lesson3.messages;

public class CreateMessage extends Message{
    public CreateMessage(String data) {
        setData(data);
        setType(MessageType.CREATE);
    }
}
