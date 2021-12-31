package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class ForumTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Test Suite: start");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testCaseUsername() {
        SimpleUser simpleUser = new SimpleUser("Marcin", "Wieczorek");
        String result = simpleUser.getUsername();
        System.out.println("Testing " + result);
        Assertions.assertEquals("Marcin", result);
    }

    @Test
    public void testCaseRealName() {
        SimpleUser simpleUser = new SimpleUser("Marcin", "Wieczorek");
        String result = simpleUser.getRealname();
        System.out.println("Testing: " + result);
        Assertions.assertEquals("Wieczorek", result);
    }
}
