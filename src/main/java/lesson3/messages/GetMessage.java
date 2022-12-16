package lesson3.messages;

public class GetMessage extends Message{
    public GetMessage(String data) {
        setData(data);
        setType(MessageType.GET);
    }
}
