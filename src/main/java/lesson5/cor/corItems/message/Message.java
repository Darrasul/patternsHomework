package lesson5.cor.corItems.message;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Message {

    private MessageType type;
    private Object object;

    public abstract Message create(Object object);

    public abstract void handle();
}
