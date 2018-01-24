package com.wilqor.workshop.testing.mocking.bonus.examples;

/**
 * Handler of messages.
 *
 * @author wilqor
 */
public interface MessageHandler {
    /**
     * Handles provided message.
     *
     * @param message message to handle
     */
    void handle(Message message);
}
