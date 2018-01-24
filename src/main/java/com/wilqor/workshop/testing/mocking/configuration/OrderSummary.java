package com.wilqor.workshop.testing.mocking.configuration;

import java.util.Objects;

/**
 * @author wilqor
 */
public final class OrderSummary {
    public static final String NOT_FOUND_DESCRIPTION = "order not found";
    public static final String NOT_FOUND_USER = "user not found";

    private final long id;
    private final String orderDescription;
    private final String userName;

    public OrderSummary(long id, String orderDescription, String userName) {
        this.id = id;
        this.orderDescription = orderDescription;
        this.userName = userName;
    }

    public long getId() {
        return id;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderSummary that = (OrderSummary) o;
        return id == that.id &&
                Objects.equals(orderDescription, that.orderDescription) &&
                Objects.equals(userName, that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderDescription, userName);
    }

    @Override
    public String toString() {
        return "OrderSummary{" +
                "id=" + id +
                ", orderDescription='" + orderDescription + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
