package com.kodilla.testing.forum;

import java.util.Objects;

public class ForumPost {
    String author;
    String postBody;

    public ForumPost(String author, String postBody) {
        this.author = author;
        this.postBody = postBody;
    }

    public String getPostBody() {
        return postBody;
    }

    public String getAuthor() {
        return author;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumPost forumPost = (ForumPost) o;
        return postBody.equals(forumPost.postBody) && author.equals(forumPost.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postBody, author);
    }
}
