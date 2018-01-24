package com.wilqor.workshop.testing.mocking.creation.examples;

import com.wilqor.workshop.testing.mocking.creation.Comment;
import com.wilqor.workshop.testing.mocking.creation.CommentLengthRecorder;
import com.wilqor.workshop.testing.mocking.creation.CommentPersistence;
import com.wilqor.workshop.testing.mocking.creation.CommentsService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Example demonstrating usage of core {@link org.mockito.Mock} annotation.
 *
 * @author wilqor
 */
@RunWith(MockitoJUnitRunner.class)
public class AnnotationMockCreationExampleTest {
    @Mock
    private CommentLengthRecorder commentLengthRecorder;
    @Mock
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
