package lesson3.messages;

public class DeleteMessage extends Message{

    public DeleteMessage(String data) {
        setData(data);
        setType(MessageType.DELETE);
    }
}
