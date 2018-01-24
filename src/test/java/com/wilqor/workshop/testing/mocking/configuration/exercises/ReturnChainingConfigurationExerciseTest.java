package com.wilqor.workshop.testing.mocking.configuration.exercises;

import com.wilqor.workshop.testing.mocking.configuration.TasksStream;

/**
 * Exercise objective: test {@link com.wilqor.workshop.testing.mocking.configuration.TaskEstimator} using
 * Mockito.when...thenReturn...thenReturn chaining.
 * You will need to create a mock of {@link com.wilqor.workshop.testing.mocking.configuration.TasksStream}
 * to reuse across test cases and pass as argument to {@link com.wilqor.workshop.testing.mocking.configuration.TaskEstimator#esitmateEffort(TasksStream)}
 * as well as create the instance of system under test.
 * Think of possible test cases to check:
 * - empty stream of tasks
 * - stream with estimate {@link com.wilqor.workshop.testing.mocking.configuration.Effort#TOO_LOW}
 * - stream with estimate {@link com.wilqor.workshop.testing.mocking.configuration.Effort#ALL_RIGHT}
 * - stream with estimate {@link com.wilqor.workshop.testing.mocking.configuration.Effort#TOO_HIGH}
 *
 * @author wilqor
 */
public class ReturnChainingConfigurationExerciseTest {
}
