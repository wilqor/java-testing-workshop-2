package com.wilqor.workshop.testing.mocking.configuration;

import java.util.Objects;

/**
 * @author wilqor
 */
public class Task {
    private final int estimate;

    public Task(int estimate) {
        this.estimate = estimate;
    }

    public int getEstimate() {
        return estimate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return estimate == task.estimate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(estimate);
    }

    @Override
    public String toString() {
        return "Task{" +
                "estimate=" + estimate +
                '}';
    }
}
