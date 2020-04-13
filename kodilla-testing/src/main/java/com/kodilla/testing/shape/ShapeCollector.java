package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumPost;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public int shapesQuantity(){
        return shapes.size();
    }

    Shape shape = null;
    public void addFigure(Shape shape){
        shapes.add(this.shape);
    }

    public void removeFigure(Shape shape){
        shapes.remove(this.shape);
    }
    Shape figures = null;
    int figureNumber = 0;
    public Shape getFigure(int figureNumber){
        if (figureNumber >= 0 && figureNumber < shapes.size()) {
            figures = shapes.get(figureNumber);
        }
        return figures;
    }

    public void showFigures(){
        System.out.println(figures);
    }
}
