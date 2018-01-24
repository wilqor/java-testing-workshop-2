package com.wilqor.workshop.testing.mocking.powermock;

/**
 * Dummy legacy class, representing dependent static methods,
 * which cannot be mocked normally with Mockito.
 *
 * @author wilqor
 */
public final class LegacyClass {

    private static final int MAGIC_STRING_FETCHING_TIME_IN_MILLIS = 10_000;

    private LegacyClass() {
    }

    /**
     * Static method with important business logic, which is not flexible
     * and without using wrapper object or Powermock it would harm
     * tests for example with complex operations that it always performs.
     * In this time it is simulated by a long wait time for fetching needed data.
     *
     * @return magic string
     */
    public static String getMagicString() {
        try {
            Thread.sleep(MAGIC_STRING_FETCHING_TIME_IN_MILLIS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        return "magic";
    }
}
