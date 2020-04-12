package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumPost;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private Shape shape;
    private int figureNumber;
    private Shape figures = null;

    public int shapesQuantity(){
        return shapes.size();
    }

    public void addFigure(Shape shape){
        shapes.add(this.shape);
    }

    public void removeFigure(Shape shape){
        shapes.remove(this.shape);
    }


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
