package lesson5.cor.corItems.handlers;

import lesson5.cor.corItems.message.Message;

public class Operator extends Handler{

    private boolean isBusy = false;
    private final String name;

    public Operator(String name) {
        this.name = name;
    }

    @Override
    public void handle(Message message) {
        if (isBusy){
            System.out.println(this.name + " is busy");
            super.handle(message);
            isBusy = false;
        } else {
            isBusy = true;
            System.out.println(this.name + " is working with " + message);
        }
    }
}
