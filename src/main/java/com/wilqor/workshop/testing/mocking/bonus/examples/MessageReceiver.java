package com.wilqor.workshop.testing.mocking.bonus.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wilqor
 */
public class MessageReceiver {
    private final List<MessageHandler> messageHandlers;

    public MessageReceiver() {
        messageHandlers = new ArrayList<>();
    }

    /**
     * Registers handler to the internally stored list.
     *
     * @param handler handler to be registered
     */
    public void registerHandler(MessageHandler handler) {
        messageHandlers.add(handler);
    }

    /**
     * Receives passed message, notifying all handlers.
     *
     * @param message message to be received
     */
    public void receiveMessage(Message message) {
        System.out.println("Received message: " + message.getText());
        messageHandlers.forEach(
                handler -> handler.handle(message)
        );
    }
}
