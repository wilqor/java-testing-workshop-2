package com.wilqor.workshop.testing.mocking.creation.exercises;

import com.wilqor.workshop.testing.mocking.creation.Comment;
import com.wilqor.workshop.testing.mocking.creation.CommentLengthRecorder;
import com.wilqor.workshop.testing.mocking.creation.CommentPersistence;
import com.wilqor.workshop.testing.mocking.creation.CommentsService;
import org.junit.Test;

/**
 * Exercise objective: Fix the test, setting up dependencies
 * of {@link CommentsService} with an annotation that injects mocks,
 * instead of manually setting it up.
 *
 * @author wilqor
 */
public class InjectionMockCreationExerciseTest {
    private CommentLengthRecorder commentLengthRecorder;
    private CommentPersistence commentPersistence;

    private CommentsService sut;

    @Test
    public void testSaveComment() throws Exception {
        Comment comment = new Comment("some comment", 1);

        sut.saveComment(comment);
    }
}
