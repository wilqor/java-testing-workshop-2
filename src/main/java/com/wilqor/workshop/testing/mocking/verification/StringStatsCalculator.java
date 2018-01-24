package com.wilqor.workshop.testing.mocking.verification;

import java.util.List;

/**
 * Dummy class calculating some statistics regarding strings it receives
 * and notifying the injected listener on its progress.
 *
 * @author wilqor
 */
public class StringStatsCalculator {
    private final StringStatsCalculationListener stringStatsCalculationListener;

    public StringStatsCalculator(StringStatsCalculationListener stringStatsCalculationListener) {
        this.stringStatsCalculationListener = stringStatsCalculationListener;
    }

    /**
     * Calculate strings from subsequent strings, passing results of
     * calculations to injected listeners.
     *
     * @param strings strings to calculate stats from
     */
    public void calculate(List<String> strings) {
        int shortestLength = 0;
        int longestLength = 0;
        int totalLength = 0;
        for (String string : strings) {
            int currentLength = string.length();
            shortestLength = Math.min(shortestLength, currentLength);
            longestLength = Math.max(longestLength, currentLength);
            totalLength += currentLength;
            notifyOnPartialResult(shortestLength, longestLength, totalLength);
        }
        notifyOnFinalResult(shortestLength, longestLength, totalLength);
    }

    private void notifyOnPartialResult(int shortestLength, int longestLength, int totalLength) {
        stringStatsCalculationListener.onPartialResult(new StringStats(shortestLength, longestLength, totalLength));
    }

    private void notifyOnFinalResult(int shortestLength, int longestLength, int totalLength) {
        stringStatsCalculationListener.onFinalResult(new StringStats(shortestLength, longestLength, totalLength));
    }
}
