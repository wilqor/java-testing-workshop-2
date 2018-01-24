package com.wilqor.workshop.testing.mocking.creation.exercises;

import com.wilqor.workshop.testing.mocking.Comment;
import com.wilqor.workshop.testing.mocking.CommentLengthRecorder;
import com.wilqor.workshop.testing.mocking.CommentPersistence;
import com.wilqor.workshop.testing.mocking.CommentsService;
import org.junit.Before;
import org.junit.Test;

/**
 * Exercise objective: Fix the test, but set up dependencies
 * of {@link CommentsService} using an annotation that injects mocks.
 *
 * @author wilqor
 */
public class InjectionMockCreationExerciseTest {
    private CommentLengthRecorder commentLengthRecorder;
    private CommentPersistence commentPersistence;

    private CommentsService sut;

    @Before
    public void setUp() throws Exception {
        sut = new CommentsService(commentLengthRecorder, commentPersistence);
    }

    @Test
    public void testSaveComment() throws Exception {
        Comment comment = new Comment("some comment", 1);

        sut.saveComment(comment);
    }
}
