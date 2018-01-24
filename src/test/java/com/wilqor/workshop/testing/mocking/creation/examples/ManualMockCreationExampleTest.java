package com.wilqor.workshop.testing.mocking.creation.examples;

import com.wilqor.workshop.testing.mocking.Comment;
import com.wilqor.workshop.testing.mocking.CommentLengthRecorder;
import com.wilqor.workshop.testing.mocking.CommentPersistence;
import com.wilqor.workshop.testing.mocking.CommentsService;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * Example demonstrating usage of {@link org.mockito.Mockito#mock(Class)} method.
 *
 * @author wilqor
 */
public class ManualMockCreationExampleTest {
    private CommentLengthRecorder commentLengthRecorder;
    private CommentPersistence commentPersistence;

    private CommentsService sut;

    @Before
    public void setUp() throws Exception {
        commentLengthRecorder = mock(CommentLengthRecorder.class);
        commentPersistence = mock(CommentPersistence.class);
        sut = new CommentsService(commentLengthRecorder, commentPersistence);
    }

    @Test
    public void testSaveComment() throws Exception {
        Comment comment = new Comment("some comment", 1);

        sut.saveComment(comment);
    }
}
