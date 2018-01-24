package com.wilqor.workshop.testing.mocking.creation;

/**
 * Service providing methods for storing comments, used as an
 * example of class with dependencies. Purposely there are
 * no implementing classes, so mocking is needed to create
 * instances of this class.
 *
 * @author wilqor
 */
public class CommentsService {
    private final CommentLengthRecorder commentLengthRecorder;
    private final CommentPersistence commentPersistence;

    public CommentsService(CommentLengthRecorder commentLengthRecorder, CommentPersistence commentPersistence) {
        this.commentLengthRecorder = commentLengthRecorder;
        this.commentPersistence = commentPersistence;
    }

    /**
     * Analyzes received comment to save its data.
     *
     * @param comment comment to save
     */
    public void saveComment(Comment comment) {
        String commentText = comment.getText();
        commentLengthRecorder.recordCommentLength(commentText.length());
        commentPersistence.saveCommentText(comment.getId(), commentText);
        System.out.println("Comment: " + comment + " has been saved");
    }
}
