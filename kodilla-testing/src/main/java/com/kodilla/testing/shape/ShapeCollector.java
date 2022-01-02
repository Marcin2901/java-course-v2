package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public int getShapeQuantity() {
        return shapes.size();
    }

    public boolean removeShape(Shape shape) {
        boolean result = false;
        if(shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getShape(int shapeNumber) {
        Shape theShape = null;
        if(shapeNumber >= 0 && shapeNumber < shapes.size()) {
            theShape = shapes.get(shapeNumber);
        }
        return theShape;
    }

    public String showFigures() {
        //String result = square.toString() + "\n" + circle.toString() + "\n" + triangle.toString();
        String figureDescription = "";
        for(Shape shape : shapes) {
            figureDescription += shape.toString() + "\n";
        }
        return figureDescription;
    }

}
