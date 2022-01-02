package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Start testing");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All test finished");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter ++;
        System.out.println("Test number #" + testCounter);
    }

    @Test
    public void testAddShape() {
        ShapeCollector collector = new ShapeCollector();
        Shape square = new Square("Square", 5);
        Shape circle = new Square("Circle", 6);
        Shape triangle = new Square("Triangle", 7);

        collector.addShape(square);
        collector.addShape(circle);
        collector.addShape(triangle);
        int result = collector.getShapeQuantity();
        System.out.println("Testing " + result);

        Assertions.assertEquals(3, result);
    }

    @Test
    public void testRemoveShapeNotExisting() {
        ShapeCollector collector = new ShapeCollector();
        Shape square = new Square("square", 5);

        boolean result = collector.removeShape(square);
        System.out.println("Testing " + result);

        Assertions.assertFalse(result);
    }

    @Test
    public void testRemovingShape() {
        ShapeCollector collector = new ShapeCollector();
        Shape circle = new Circle("circle", 3);
        collector.addShape(circle);

        boolean result = collector.removeShape(circle);
        System.out.println("Testing " + result);

        Assertions.assertTrue(result);
        Assertions.assertEquals(0, collector.getShapeQuantity());
    }

    @Test
    public void testGetFigure() {
        ShapeCollector collector = new ShapeCollector();
        Shape square = new Square("square", 5);
        collector.addShape(square);

        Shape retrievedFigure = collector.getShape(0);
        System.out.println("Testing " + retrievedFigure);

        Assertions.assertEquals(square, retrievedFigure);
    }

    @Test
    public void testShowFigures() {
        ShapeCollector collector = new ShapeCollector();
        Shape square = new Square("Square", 5);
        Shape circle = new Circle("Circle", 6);
        Shape triangle = new Triangle("Triangle", 7);

        collector.addShape(square);
        collector.addShape(circle);
        collector.addShape(triangle);
        String result = collector.showFigures();
        System.out.println("Testing " + result);

        String expectedResults = "Shape :name = 'Square', slide = 5.0, field = 25.0\n" +
                                 "Shape :name = 'Circle', slide = 6.0, field = 113.03999999999999\n" +
                                 "Shape :name = 'Triangle', slide = 7.0, field = 3.031088913245535\n";
        Assertions.assertEquals(expectedResults, result);
    }

}
