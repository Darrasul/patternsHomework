package lesson5.cor.corItems.handlers;

import lesson5.cor.corItems.message.Message;

public class BusyHandler extends Handler{
    private Message message;

    @Override
    public void handle(Message message) {
        if (this.message == message) {
            System.out.println("There are no available operators");
        } else {
            this.message = message;
        }
        super.handle(message);
    }
}
