package com.wilqor.workshop.testing.mocking.creation;

/**
 * Dependency of {@link CommentsService}, needed for saving comments in persistence.
 *
 * @author wilqor
 */
public interface CommentPersistence {
    /**
     * Saves comment text with associated id
     *
     * @param id id of comment
     * @param text text of comment
     */
    void saveCommentText(long id, String text);
}
