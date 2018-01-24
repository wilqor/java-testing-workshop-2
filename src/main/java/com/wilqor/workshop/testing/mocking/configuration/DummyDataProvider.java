package com.wilqor.workshop.testing.mocking.configuration;

import com.wilqor.workshop.testing.mocking.creation.Comment;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Interface made for showcasing default mock values.
 * It is not intended to have any reasonable purpose.
 *
 * @author wilqor
 */
public interface DummyDataProvider {
    int getIntValue();

    boolean getBooleanValue();

    float getFloatValue();

    Integer getBoxedIntValue();

    String getStringValue();

    Comment getObjectValue();

    Set<Boolean> getSetValue();

    List<Long> getListValue();

    Map<Long, List<String>> getMapValue();
}
