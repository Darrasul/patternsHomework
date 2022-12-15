package lesson3.messages;

public class UpdateMessage extends Message{

    public UpdateMessage(String data) {
        setData(data);
        setType(MessageType.UPDATE);
    }
}
