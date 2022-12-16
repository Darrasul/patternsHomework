package lesson3;

import lesson3.messageFactory.*;
import lesson3.messages.Message;

import java.util.Locale;
import java.util.Scanner;

public class FactoryInit {

    private static final Scanner scanner = new Scanner(System.in);
    private static final CreateMessageFactory createFactory = new CreateMessageFactory();
    private static final DeleteMessageFactory deleteFactory = new DeleteMessageFactory();
    private static final EndMessageFactory endFactory = new EndMessageFactory();
    private static final GetMessageFactory getFactory = new GetMessageFactory();
    private static final UpdateMessageFactory updateFactory = new UpdateMessageFactory();

    public static void main(String[] args) {
        int round = 1;
        boolean isDead = false;
        System.out.println("type something");
        while (true) {
            if (!isDead){
                String answer = scanner.nextLine().toLowerCase(Locale.ROOT).trim();
                switch (answer) {
                    case "end" -> {
                        createMessage(endFactory, "end message at " + round + "round");
                        isDead = true;
                    }
                    case "create" -> {
                        createMessage(createFactory, "create message at " + round + "round");
                        round += 1;
                    }
                    case "delete" -> {
                        createMessage(deleteFactory, "delete message at " + round + "round");
                        round += 1;
                    }
                    case "get" -> {
                        createMessage(getFactory, "get message at " + round + "round");
                        round += 1;
                    }
                    case "update" -> {
                        createMessage(updateFactory, "update message at " + round + "round");
                        round += 1;
                    }
                    default -> {
                        System.out.println("Type the message type first");
                        round += 1;
                    }
                }
            } else {
                break;
            }
        }
        scanner.close();
    }

    private static void createMessage(MessageFactory factory, String data){
        Message message = factory.getMessage(data);
        System.out.println(message.getType());
        System.out.println(message.getData());
    }
}
