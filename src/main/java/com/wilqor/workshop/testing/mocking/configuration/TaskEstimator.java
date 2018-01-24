package com.wilqor.workshop.testing.mocking.configuration;

import java.util.stream.Stream;

/**
 * Dummy class able to estimate effort based on tasks
 * returned by tasks stream.
 *
 * @author wilqor
 */
public final class TaskEstimator {
    /**
     * Estimates effort of tasks in provided stream.
     *
     * @param tasksStream tasks stream to estimate
     * @return estimated effort
     */
    public Effort esitmateEffort(TasksStream tasksStream) {
        final int totalEstimate = getTotalEstimate(tasksStream);
        return Stream.of(Effort.values())
                .filter(effort -> totalEstimate >= effort.getEffortLowerBoundInclusive() && totalEstimate < effort.getEffortUpperBoundExclusive())
                .findFirst()
                // there should always be a match found in filter, so this value serves as a default
                .orElse(Effort.TOO_LOW);
    }

    private int getTotalEstimate(TasksStream tasksStream) {
        int totalEstimate = 0;
        Task nextTask;
        while ((nextTask = tasksStream.getNextTask()) != null) {
            totalEstimate += nextTask.getEstimate();
        }
        return totalEstimate;
    }
}
