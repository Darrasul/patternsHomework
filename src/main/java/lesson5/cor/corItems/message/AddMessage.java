package lesson5.cor.corItems.message;

public class AddMessage extends Message {

    public AddMessage(Object object) {
        setType(MessageType.ADD);
        setObject(object);
    }

    @Override
    public Message create(Object object) {
        return new AddMessage(object);
    }

    @Override
    public void handle() {
        System.out.println("AddMessage with " + getObject().toString());
    }
}
