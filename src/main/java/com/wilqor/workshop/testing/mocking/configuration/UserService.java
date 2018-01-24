package com.wilqor.workshop.testing.mocking.configuration;

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
    UserDetails getDetailsForUser(long userId);
}
