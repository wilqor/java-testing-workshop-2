package com.wilqor.workshop.testing.mocking.powermock;

/**
 * Dummy class dependent on {@link LegacyClass}.
 *
 * @author wilqor
 */
public class LegacyClassUser {
    /**
     * Produces and returns a magic string with given prefix before
     * and suffix after it.
     *
     * @param prefix prefix to add before magic string
     * @param suffix suffix to add after magic string
     * @return magic string printed with prefix and suffix
     */
    public String printMagicString(String prefix, String suffix) {
        return prefix.concat(LegacyClass.getMagicString()).concat(suffix);
    }
}
