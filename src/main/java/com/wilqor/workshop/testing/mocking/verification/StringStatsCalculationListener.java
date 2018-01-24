package com.wilqor.workshop.testing.mocking.verification;

/**
 * Exemplary listener for demonstrating interaction/side effects
 * in case of testing {@link StringStatsCalculator};
 *
 * @author wilqor
 */
public interface StringStatsCalculationListener {
    /**
     * Handles partial result of string stats calculation.
     *
     * @param stringStats partial stats result
     */
    void onPartialResult(StringStats stringStats);

    /**
     * Handles final result of string stats calculation.
     *
     * @param stringStats final stats result
     */
    void onFinalResult(StringStats stringStats);
}
