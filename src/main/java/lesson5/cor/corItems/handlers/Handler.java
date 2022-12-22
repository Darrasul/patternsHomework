package lesson5.cor.corItems.handlers;

import lesson5.cor.corItems.message.Message;

public abstract class Handler {
    private Handler next;

    public void handle(Message message){
        if (next != null){
            next.handle(message);
        }
    }

    public Handler link(Handler next) {
        this.next = next;
        return next;
    }
}
