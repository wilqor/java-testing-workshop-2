package com.wilqor.workshop.testing.mocking.bonus.examples;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.inOrder;

/**
 * @author wilqor
 */
@RunWith(MockitoJUnitRunner.class)
public class InOrderVerificationExampleTest {
    @Mock
    private MessageHandler handlerOne;
    @Mock
    private MessageHandler handlerTwo;

    private MessageReceiver sut;

    @Before
    public void setUp() throws Exception {
        sut = new MessageReceiver();
        sut.registerHandler(handlerOne);
        sut.registerHandler(handlerTwo);
    }

    @Test
    public void testReceive_notifiesHandlersInOrder() throws Exception {
        Message message = new Message(100L, "important message");

        sut.receiveMessage(message);

        InOrder inOrder = inOrder(handlerOne, handlerTwo);
        inOrder.verify(handlerOne).handle(message);
        inOrder.verify(handlerTwo).handle(message);
    }
}
