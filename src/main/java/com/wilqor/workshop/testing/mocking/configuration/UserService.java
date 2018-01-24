package com.wilqor.workshop.testing.mocking.configuration;

import com.sun.istack.internal.Nullable;

/**
 * Interface of dummy service retrieving details for orders.
 *
 * @author wilqor
 */
public interface UserService {
    /**
     * Retrieves details for user.
     *
     * @param userId id of user to get
     * @return user details or null if none found
     */
    @Nullable
    UserDetails getDetailsForUser(long userId);
}
