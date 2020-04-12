package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String shapeName;
    int shapeField;

    public Triangle(String shapeName, int shapeField) {
        this.shapeName = shapeName;
        this.shapeField = shapeField;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public int getField() {
        return 19;
    }
}
