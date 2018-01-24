package com.wilqor.workshop.testing.mocking.configuration.examples;

import com.wilqor.workshop.testing.mocking.configuration.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Example demonstrating configuring values returned by created mocks
 * to instrument behavior of system under test.
 *
 * @author wilqor
 */
@RunWith(MockitoJUnitRunner.class)
public class SimpleConfigurationExampleTest {
    @Mock
    private UserService userService;
    @Mock
    private OrderService orderService;

    private OrderSummaryService sut;

    @Before
    public void setUp() throws Exception {
        sut = new OrderSummaryService(userService, orderService);
    }

    @Test
    public void testRetrieveOrderSummary_orderAndUserFound() throws Exception {
        long orderId = 10L;
        long userId = 20L;
        String orderDescription = "some order description";
        String userName = "Mocker";
        OrderDetails detailsForOrder = new OrderDetails(userId, orderDescription);
        when(orderService.getDetailsForOrder(orderId)).thenReturn(detailsForOrder);
        when(userService.getDetailsForUser(userId)).thenReturn(new UserDetails(userId, userName));
        OrderSummary expectedOrderSummary = new OrderSummary(orderId, orderDescription, userName);

        OrderSummary actualOrderSummary = sut.retrieveOrderSummary(orderId);

        assertEquals(expectedOrderSummary, actualOrderSummary);
    }

    @Test
    public void testRetrieveOrderSummary_orderFoundAndUserNotFound() throws Exception {
        long orderId = 20L;
        long userId = 40L;
        String orderDescription = "some order description";
        OrderDetails detailsForOrder = new OrderDetails(userId, orderDescription);
        when(orderService.getDetailsForOrder(orderId)).thenReturn(detailsForOrder);
        when(userService.getDetailsForUser(userId)).thenReturn(null);
        OrderSummary expectedOrderSummary = new OrderSummary(orderId, orderDescription, OrderSummary.NOT_FOUND_USER);

        OrderSummary actualOrderSummary = sut.retrieveOrderSummary(orderId);

        assertEquals(expectedOrderSummary, actualOrderSummary);
    }

    @Test
    public void testRetrieveOrderSummary_orderNotFound() throws Exception {
        long orderId = 20L;
        when(orderService.getDetailsForOrder(orderId)).thenReturn(null);
        OrderSummary expectedOrderSummary = new OrderSummary(orderId, OrderSummary.NOT_FOUND_DESCRIPTION, OrderSummary.NOT_FOUND_USER);

        OrderSummary actualOrderSummary = sut.retrieveOrderSummary(orderId);

        assertEquals(expectedOrderSummary, actualOrderSummary);
    }
}
