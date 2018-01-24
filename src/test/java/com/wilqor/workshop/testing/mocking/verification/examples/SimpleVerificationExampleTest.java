package com.wilqor.workshop.testing.mocking.verification.examples;

import com.wilqor.workshop.testing.mocking.verification.StringStatsCalculationListener;
import com.wilqor.workshop.testing.mocking.verification.StringStats;
import com.wilqor.workshop.testing.mocking.verification.StringStatsCalculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Example test demonstrating usage of Mockito verification.
 *
 * @author wilqor
 */
@RunWith(MockitoJUnitRunner.class)
public class SimpleVerificationExampleTest {
    @Mock
    private StringStatsCalculationListener stringStatsCalculationListener;

    private StringStatsCalculator sut;

    @Before
    public void setUp() throws Exception {
        sut = new StringStatsCalculator(stringStatsCalculationListener);
    }

    @Test
    public void testCalculate_normalInput() throws Exception {
        List<String> input = Arrays.asList("abc", "qwerty", "mockito", "");

        sut.calculate(input);

        verify(stringStatsCalculationListener, times(input.size())).onPartialResult(any(StringStats.class));
        verify(stringStatsCalculationListener).onFinalResult(new StringStats(0, 7, 16));
    }

    @Test
    public void testCalculate_emptyInput() throws Exception {
        List<String> input = Collections.emptyList();

        sut.calculate(input);

        verify(stringStatsCalculationListener, never()).onPartialResult(any(StringStats.class));
        verify(stringStatsCalculationListener).onFinalResult(new StringStats(0, 0, 0));
    }
}
