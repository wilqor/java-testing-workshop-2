package com.wilqor.workshop.testing.mocking.configuration.examples;

import com.wilqor.workshop.testing.mocking.configuration.DummyDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Dummy test presenting, what values are returned
 * by mocks if they are not configured with specific
 * behavior.
 *
 * @author wilqor
 */
@RunWith(MockitoJUnitRunner.class)
public class DefaultValuesConfigurationExampleTest {
    @Mock
    private DummyDataProvider dataProviderMock;

    @Test
    public void testDefaultValues() throws Exception {
        System.out.println("Default int value: " + dataProviderMock.getIntValue());
        System.out.println("Default boolean value: " + dataProviderMock.getBooleanValue());
        System.out.println("Default float value: " + dataProviderMock.getFloatValue());
        System.out.println("Default boxed int value: " + dataProviderMock.getBoxedIntValue());
        System.out.println("Default string value: " + dataProviderMock.getStringValue());
        System.out.println("Default object value: " + dataProviderMock.getObjectValue());
        System.out.println("Default set value: " + dataProviderMock.getSetValue());
        System.out.println("Default list value: " + dataProviderMock.getListValue());
        System.out.println("Default map value: " + dataProviderMock.getMapValue());
    }
}
