package com.wilqor.workshop.testing.mocking.verification;

import java.util.Objects;

/**
 * @author wilqor
 */
public class StringStats {
    private final int shortestLength;
    private final int longestLength;
    private final int totalLength;

    public StringStats(int shortestLength, int longestLength, int totalLength) {
        this.shortestLength = shortestLength;
        this.longestLength = longestLength;
        this.totalLength = totalLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringStats that = (StringStats) o;
        return shortestLength == that.shortestLength &&
                longestLength == that.longestLength &&
                totalLength == that.totalLength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shortestLength, longestLength, totalLength);
    }

    @Override
    public String toString() {
        return "StringStats{" +
                "shortestLength=" + shortestLength +
                ", longestLength=" + longestLength +
                ", totalLength=" + totalLength +
                '}';
    }
}
