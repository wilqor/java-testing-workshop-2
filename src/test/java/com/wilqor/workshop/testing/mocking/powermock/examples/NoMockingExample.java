package com.wilqor.workshop.testing.mocking.powermock.examples;

import com.wilqor.workshop.testing.mocking.powermock.LegacyClass;
import com.wilqor.workshop.testing.mocking.powermock.LegacyClassUser;
import org.junit.Before;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * In this example there is no mocking done to show
 * the actual behavior of mocked class, which cannot be mocked
 * using Mockito only without introducing a wrapper class.
 *
 * @author wilqor
 */
public class NoMockingExample {
    private LegacyClassUser sut;

    @Before
    public void setUp() throws Exception {
        sut = new LegacyClassUser();
    }

    @Test
    public void testPrintMagicString() throws Exception {
        String prefix = "pre_";
        String suffix = "_suff";
        String mockedMagicString = "magic";
        String expected = prefix + mockedMagicString + suffix;

        String actual = sut.printMagicString(prefix, suffix);

        assertEquals(expected, actual);
    }
}
