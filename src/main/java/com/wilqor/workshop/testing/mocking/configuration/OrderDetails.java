package com.wilqor.workshop.testing.mocking.configuration;

import java.util.Objects;

/**
 * @author wilqor
 */
public final class OrderDetails {
    private final long userId;
    private final String description;

    public OrderDetails(long userId, String description) {
        this.userId = userId;
        this.description = description;
    }

    public long getUserId() {
        return userId;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetails that = (OrderDetails) o;
        return userId == that.userId &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, description);
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "userId=" + userId +
                ", description='" + description + '\'' +
                '}';
    }
}
