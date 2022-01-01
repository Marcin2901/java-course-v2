package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter ++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("Chudy", "Marcin");

        //When
        forumUser.addPost(forumUser.getName(), "This is my new Post");
        int result = forumUser.getPostsQuantity();
        //Then
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testAddComment() {
        ForumUser forumUser = new ForumUser("Chudy", "Marcin");
        ForumPost thePost = new ForumPost(forumUser.getName(), "This is my Post");

        forumUser.addComment(thePost, forumUser.getRealName(), "This is my comment");
        int result = forumUser.getCommentsQuantity();

        Assertions.assertEquals(1, result);
    }

    @Test
    public void testGetPost() {
        ForumUser forumUser = new ForumUser("Chudy", "Marcin");
        ForumPost thePost = new ForumPost(forumUser.getName(), "This is Post about animals");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        ForumPost retrievedPost = forumUser.getPost(0);

        Assertions.assertEquals(thePost, retrievedPost);
    }

    @Test
    public void testGetComment() {
        ForumUser forumUser = new ForumUser("Chudy", "Marcin");
        ForumPost thePost = new ForumPost(forumUser.getName(), "This is my awesome Post");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        ForumComment theComment = new ForumComment(forumUser.getPost(0), forumUser.getName(), "This is my awesome Comment");
        forumUser.addComment(theComment.getForumPost(), theComment.getAuthor(), theComment.getCommentBody());

        ForumComment retrievedComment = forumUser.getComment(0);

        Assertions.assertEquals(theComment, retrievedComment);
    }

    @Test
    public void testRemovePostNotExisting() {
        ForumUser forumUser = new ForumUser("Chudy", "Marcin");
        ForumPost thePost = new ForumPost("mrsSmith", "Not Existing Post");

        boolean result = forumUser.removePost(thePost);

        Assertions.assertFalse(result);
    }

    @Test
    public void testRemovingCommentNotExisting() {
        ForumUser forumUser = new ForumUser("Chudy", "Marcin");
        ForumPost thePost = new ForumPost(forumUser.getName(), "Some Post");
        ForumComment theComment = new ForumComment(thePost, "mrsSmith", "Not Existing Comment");

        boolean result = forumUser.removeComment(theComment);

        Assertions.assertFalse(result);
    }

    @Test
    public void testRemovePost() {
        ForumUser forumUser = new ForumUser("Chudy", "Marcin");
        ForumPost thePost = new ForumPost(forumUser.getName(), "Just my Post");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        boolean result = forumUser.removePost(thePost);

        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test
    public void testRemovingComment() {
        ForumUser forumUser = new ForumUser("Chudy", "Marcin");
        ForumPost thePost = new ForumPost(forumUser.getName(), "My Post");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        ForumComment theComment = new ForumComment(thePost, forumUser.getName(), "My Comment");
        forumUser.addComment(theComment.getForumPost(), theComment.getAuthor(), theComment.getCommentBody());

        boolean result = forumUser.removeComment(theComment);

        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getCommentsQuantity());
    }

}
