package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task prepareTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Turn right.", "At the nearest roundabout.", "In car.");
            case PAINTING:
                return new PaintingTask("Paint a wall.", "White.", "In the kitchen.");
            case SHOPPING:
                return new ShoppingTask("Grocery.", "Flour.", 1.0);
            default:
                return null;
        }
    }
}
