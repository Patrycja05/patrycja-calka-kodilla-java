package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("Clean the office.");
        board.getInProgressList().getTasks().add("Prepare communications.");
        board.getDoneList().getTasks().add("Send e-mails.");
        //Then
        Assert.assertNotNull(board.getToDoList());
        Assert.assertNotNull(board.getInProgressList());
        Assert.assertNotNull(board.getDoneList());
    }
}
