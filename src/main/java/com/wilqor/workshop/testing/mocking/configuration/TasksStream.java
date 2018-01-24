package com.wilqor.workshop.testing.mocking.configuration;

import com.sun.istack.internal.Nullable;

/**
 * Interface representing streams of tasks for estimation.
 *
 * @author wilqor
 */
public interface TasksStream {
    /**
     * Gets next task to estimate.
     *
     * @return next task or null if there are no more tasks
     */
    @Nullable
    Task getNextTask();
}
