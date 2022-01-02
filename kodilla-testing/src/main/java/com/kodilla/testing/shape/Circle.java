package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{

    private String name;
    private double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public double getField() {
        return 3.14*radius*radius;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0 && getName().equals(circle.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRadius());
    }

    @Override
    public String toString() {
        return "Shape :" +
                "name = '" + name + '\'' +
                ", slide = " + radius +
                ", field = " + this.getField();
    }
}
