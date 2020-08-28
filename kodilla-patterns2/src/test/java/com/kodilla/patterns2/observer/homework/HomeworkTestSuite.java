package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {

    @Test
    public void testTasks(){
        //Given
        TasksDatabase student1Tasks = new Student1Tasks();
        TasksDatabase student2Tasks = new Student2Tasks();
        TasksDatabase student3Tasks = new Student3Tasks();

        Mentor mentor1 = new Mentor("Mentor1");
        Mentor mentor2 = new Mentor("Mentor2");

        student1Tasks.sendTaskToVerification(mentor1);
        student2Tasks.sendTaskToVerification(mentor1);
        student3Tasks.sendTaskToVerification(mentor2);

        //When
        student1Tasks.addTask("Task1");
        student1Tasks.addTask("Task2");
        student2Tasks.addTask("Task3");
        student3Tasks.addTask("Task4");
        student3Tasks.addTask("Task5");
        student3Tasks.addTask("Task6");
        student3Tasks.addTask("Task7");

        //Then
        Assert.assertEquals(3, mentor1.getUpdateCount());
        Assert.assertEquals(4, mentor2.getUpdateCount());
    }
}
