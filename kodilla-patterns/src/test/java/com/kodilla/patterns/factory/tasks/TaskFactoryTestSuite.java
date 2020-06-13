package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.prepareTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Turn right.", driving.getTaskName());
        Assert.assertEquals("Task: Turn right. in progress...", driving.executeTask());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory1 = new TaskFactory();
        //When
        Task painting = factory1.prepareTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Paint a wall.", painting.getTaskName());
        Assert.assertEquals("Task in progress...", painting.executeTask());
    }

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory2 = new TaskFactory();
        //When
        Task shopping = factory2.prepareTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Grocery.", shopping.getTaskName());
        Assert.assertEquals("Go to shop!!!", shopping.executeTask());
    }
}
