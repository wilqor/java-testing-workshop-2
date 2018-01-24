package com.wilqor.workshop.testing.mocking.configuration;

/**
 * Enumeration representing ranges of total effort
 * values.
 *
 * @author wilqor
 */
public enum Effort {
    TOO_LOW(Integer.MIN_VALUE, 0),
    ALL_RIGHT(0, 10),
    TOO_HIGH(10, Integer.MAX_VALUE);

    private final int effortLowerBoundInclusive;
    private final int effortUpperBoundExclusive;

    Effort(int effortLowerBoundInclusive, int effortUpperBoundExclusive) {
        this.effortLowerBoundInclusive = effortLowerBoundInclusive;
        this.effortUpperBoundExclusive = effortUpperBoundExclusive;
    }

    public int getEffortLowerBoundInclusive() {
        return effortLowerBoundInclusive;
    }

    public int getEffortUpperBoundExclusive() {
        return effortUpperBoundExclusive;
    }
}
