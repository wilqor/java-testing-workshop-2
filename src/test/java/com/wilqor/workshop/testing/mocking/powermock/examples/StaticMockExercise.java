package com.wilqor.workshop.testing.mocking.powermock.examples;

import com.wilqor.workshop.testing.mocking.powermock.LegacyClass;
import com.wilqor.workshop.testing.mocking.powermock.LegacyClassUser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Exercise objective: Get rid of PowerMock usage. To do this
 * you need to introduce a wrapper for LegacyClass and use it in LegacyClassUser
 * instead of relying on the static reference. The wrapper could then be
 * easily mocked.
 *
 * @author wilqor
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(LegacyClass.class)
public class StaticMockExercise {
    private LegacyClassUser sut;

    @Before
    public void setUp() throws Exception {
        sut = new LegacyClassUser();
    }

    @Test
    public void testPrintMagicString() throws Exception {
        String prefix = "pre_";
        String suffix = "_suff";
        String mockedMagicString = "some magic string";
        PowerMockito.mockStatic(LegacyClass.class);
        when(LegacyClass.getMagicString()).thenReturn(mockedMagicString);
        String expected = prefix + mockedMagicString + suffix;

        String actual = sut.printMagicString(prefix, suffix);

        assertEquals(expected, actual);
    }
}
