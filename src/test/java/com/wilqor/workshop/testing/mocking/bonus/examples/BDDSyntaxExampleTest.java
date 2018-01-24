package com.wilqor.workshop.testing.mocking.bonus.examples;

import com.wilqor.workshop.testing.mocking.verification.StringStats;
import com.wilqor.workshop.testing.mocking.verification.StringStatsCalculationListener;
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
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;

/**
 * Example demonstrating usage of BDD syntax available
 * in Mockito.
 *
 * @author wilqor
 */
@RunWith(MockitoJUnitRunner.class)
public class BDDSyntaxExampleTest {
    @Mock
    private StringStatsCalculationListener stringStatsCalculationListener;

    private StringStatsCalculator sut;

    @Before
    public void setUp() throws Exception {
        sut = new StringStatsCalculator(stringStatsCalculationListener);
    }

    @Test
    public void shouldNotifyForEachString() throws Exception {
        //given, typically as below
        // given(someMock.onMethodCall(any(ArgumentClass.class))).willReturn("some value");
        List<String> input = Arrays.asList("abc", "qwerty", "mockito", "");

        //when
        sut.calculate(input);

        //then
        then(stringStatsCalculationListener).should(times(input.size())).onPartialResult(any(StringStats.class));
        then(stringStatsCalculationListener).should().onFinalResult(new StringStats(0, 7, 16));
    }

    @Test
    public void shouldNotifyOnlyForFinalResult() throws Exception {
        //given
        List<String> input = Collections.emptyList();

        //when
        sut.calculate(input);

        //then
        then(stringStatsCalculationListener).should(never()).onPartialResult(any(StringStats.class));
        then(stringStatsCalculationListener).should().onFinalResult(new StringStats(0, 0, 0));
    }
}
