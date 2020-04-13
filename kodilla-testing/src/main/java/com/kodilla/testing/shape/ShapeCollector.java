package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumPost;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public int shapesQuantity(){
        return shapes.size();
    }

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public void removeFigure(Shape shape){
        shapes.remove(shape);
    }

    public Shape getFigure(int figureNumber){
        Shape figures = null;
        if (figureNumber >= 0 && figureNumber < shapes.size()) {
            figures = shapes.get(figureNumber);
        }
        return figures;
    }

    public void showFigures(){
        System.out.println(getFigure(shapes.size()));
    }
}
