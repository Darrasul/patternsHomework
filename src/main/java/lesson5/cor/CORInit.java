package lesson5.cor;

import lesson5.cor.corItems.handlers.BusyHandler;
import lesson5.cor.corItems.handlers.Handler;
import lesson5.cor.corItems.handlers.Operator;
import lesson5.cor.corItems.message.AddMessage;
import lesson5.cor.corItems.message.DeleteMessage;
import lesson5.cor.corItems.message.FindMessage;
import lesson5.cor.products.Product;

public class CORInit {
    public static void main(String[] args) {
        Handler busyHandler = new BusyHandler();
        busyHandler.link(new Operator("First"))
                .link(new Operator("Second"))
                .link(new Operator("Third"))
                .link(busyHandler);

        busyHandler.handle(new DeleteMessage(new Product("#1", 25.00)));
        busyHandler.handle(new FindMessage(new Product("#2", 15.00)));
        busyHandler.handle(new FindMessage(new Product("#3", 35.00)));
        busyHandler.handle(new AddMessage(new Product("#4", 65.00)));
        busyHandler.handle(new AddMessage(new Product("#5", 45.00)));
    }
}
