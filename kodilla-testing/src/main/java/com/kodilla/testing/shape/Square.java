package com.kodilla.testing.shape;

public class Square implements Shape {
    String shapeName;
    int shapeField;

    public Square(String shapeName, int shapeField) {
        this.shapeName = shapeName;
        this.shapeField = shapeField;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public int getField() {
        return 45;
    }
}
