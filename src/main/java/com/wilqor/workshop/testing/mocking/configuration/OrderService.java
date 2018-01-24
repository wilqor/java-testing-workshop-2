package com.wilqor.workshop.testing.mocking.configuration;

import com.sun.istack.internal.Nullable;

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
    @Nullable
    OrderDetails getDetailsForOrder(long orderId);
}
