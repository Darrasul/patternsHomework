package lesson5.cor.corItems.message;

public class DeleteMessage extends Message{

    public DeleteMessage(Object object) {
        setType(MessageType.DELETE);
        setObject(object);
    }

    @Override
    public Message create(Object object) {
        return new DeleteMessage(object);
    }

    @Override
    public void handle() {
        System.out.println("DeleteMessage with " + getObject().toString());
    }
}
