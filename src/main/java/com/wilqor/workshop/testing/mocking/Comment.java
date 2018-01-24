package com.wilqor.workshop.testing.mocking;

import java.util.Objects;

/**
 * @author wilqor
 */
public final class Comment {
    private final String text;
    private final long id;

    public Comment(String text, long id) {
        this.text = text;
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return id == comment.id &&
                Objects.equals(text, comment.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, id);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "text='" + text + '\'' +
                ", id=" + id +
                '}';
    }

}
