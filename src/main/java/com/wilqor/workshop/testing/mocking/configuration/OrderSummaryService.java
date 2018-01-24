package com.wilqor.workshop.testing.mocking.configuration;

import java.util.Optional;

/**
 * Service simulating retrieval of order summary, using
 * {@link UserService} and {@link OrderService} underneath.
 *
 * @author wilqor
 */
public final class OrderSummaryService {
    private final UserService userService;
    private final OrderService orderService;

    public OrderSummaryService(UserService userService, OrderService orderService) {
        this.userService = userService;
        this.orderService = orderService;
    }

    /**
     * Retrieves order summary for given order id, in case of
     * missing data constants indicating not found values
     * defined in {@link OrderSummary} are used.
     *
     * @param orderId id of order to retrieve
     * @return retrieved order summary
     */
    public OrderSummary retrieveOrderSummary(long orderId) {
        Optional<OrderDetails> orderDetailsOptional = Optional.ofNullable(orderService.getDetailsForOrder(orderId));
        String orderDescription = orderDetailsOptional.map(OrderDetails::getDescription)
                .orElse(OrderSummary.NOT_FOUND_DESCRIPTION);
        String userName = orderDetailsOptional.map(orderDetails -> userService.getDetailsForUser(orderDetails.getUserId()))
                .map(UserDetails::getName)
                .orElse(OrderSummary.NOT_FOUND_USER);
        return new OrderSummary(orderId, orderDescription, userName);
    }
}
