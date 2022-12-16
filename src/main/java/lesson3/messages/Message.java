package lesson3.messages;

public abstract class Message {

    private String data;

    private MessageType type;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public void getMessage() {
        System.out.println(this);
    }
}
