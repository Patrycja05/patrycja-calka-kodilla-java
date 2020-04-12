package com.kodilla.testing.shape;

public class Circle implements Shape {
    String shapeName;
    int shapeField;

    public Circle(String shapeName, int shapeField) {
        this.shapeName = shapeName;
        this.shapeField = shapeField;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public int getField() {
        return 25;
    }
}
