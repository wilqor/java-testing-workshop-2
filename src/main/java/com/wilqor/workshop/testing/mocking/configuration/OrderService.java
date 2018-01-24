package com.wilqor.workshop.testing.mocking.configuration;

/**
 * Interface of dummy service retrieving details for orders.
 *
 * @author wilqor
 */
public interface OrderService {
    /**
     * Retrieves details for order.
     *
     * @param orderId id of order to get
     * @return order details or null if none were found
     */
    OrderDetails getDetailsForOrder(long orderId);
}
