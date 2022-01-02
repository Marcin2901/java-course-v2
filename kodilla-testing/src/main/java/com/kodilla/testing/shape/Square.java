package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{

    private String name;
    private double slide;

    public Square(String name, double slide) {
        this.name = name;
        this.slide = slide;
    }

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public double getField() {
        return slide*slide;
    }

    public double getSide() {
        return this.slide;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.slide, slide) == 0 && name.equals(square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, slide);
    }

    @Override
    public String toString() {
        return "Shape :" +
                "name = '" + name + '\'' +
                ", slide = " + slide +
                ", field = " + this.getField();
    }
}
