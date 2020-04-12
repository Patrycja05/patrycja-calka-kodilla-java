package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle("Circle", 23);
        //When
        collector.addFigure(circle);
        //Then
        Assert.assertEquals(1, collector.shapesQuantity());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle1 = new Circle("Circle", 23);
        //When
        collector.addFigure(circle1);
        collector.removeFigure(circle1);
        //Then
        Assert.assertEquals(0, collector.shapesQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle2 = new Circle("Circle", 23);
        //When
        collector.addFigure(circle2);
        collector.getFigure(1);
        //Then
        Assert.assertEquals(1, collector.shapesQuantity());
    }
}
