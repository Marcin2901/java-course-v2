package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{

    private String name;
    private double slide;

    public Triangle(String name, double slide) {
        this.name = name;
        this.slide = slide;
    }

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public double getField() {
        return (slide*Math.sqrt(3))/4;
    }

    public String getName() {
        return name;
    }

    public double getSlide() {
        return slide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.getSlide(), getSlide()) == 0 && getName().equals(triangle.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSlide());
    }

    @Override
    public String toString() {
        return "Shape :" +
                "name = '" + name + '\'' +
                ", slide = " + slide +
                ", field = " + this.getField();
    }
}
