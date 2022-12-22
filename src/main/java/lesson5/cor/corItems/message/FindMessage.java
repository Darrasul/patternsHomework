package lesson5.cor.corItems.message;

public class FindMessage extends Message{

    public FindMessage(Object object) {
        setType(MessageType.FIND);
        setObject(object);
    }

    @Override
    public Message create(Object object) {
        return new FindMessage(object);
    }

    @Override
    public void handle() {
        System.out.println("FindMessage with " + getObject().toString());
    }
}
