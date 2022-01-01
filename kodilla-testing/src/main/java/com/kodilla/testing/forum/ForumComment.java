package com.kodilla.testing.forum;

import java.util.Objects;

public class ForumComment {
    ForumPost forumPost;
    String author;
    String commentBody;


    public ForumComment(ForumPost forumPost, String author, String commentBody) {
        this.forumPost = forumPost;
        this.author = author;
        this.commentBody = commentBody;

    }

    public ForumPost getForumPost() {
        return forumPost;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumComment)) return false;
        ForumComment that = (ForumComment) o;
        return getForumPost().equals(that.getForumPost()) && getCommentBody().equals(that.getCommentBody()) && getAuthor().equals(that.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getForumPost(), getCommentBody(), getAuthor());
    }
}
