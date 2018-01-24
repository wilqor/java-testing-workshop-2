package com.wilqor.workshop.testing.mocking.creation;

/**
 * Dependency of {@link CommentsService}, needed for recording comment length.
 *
 * @author wilqor
 */
public interface CommentLengthRecorder {
    /**
     * Records comment length.
     *
     * @param length length of comment
     */
    void recordCommentLength(int length);
}
