package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void testCalculateAdvStatistics1(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesList = new ArrayList<>();
        for(int n = 0; n < 1000; n++){
            usersNamesList.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);

        Methods calculate = new Methods(statisticsMock);
        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1, calculate.averagePostsPerUser, 0);
        Assert.assertEquals(2, calculate.averageCommentsPerUser, 0);
        Assert.assertEquals(2, calculate.averageCommentsPerPost, 0);
    }
    @Test
    public void testCalculateAdvStatistics2(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesList = new ArrayList<>();
        for(int n = 0; n < 1000; n++){
            usersNamesList.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(2000);

        Methods calculate = new Methods(statisticsMock);
        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, calculate.averagePostsPerUser, 0);
        Assert.assertEquals(2, calculate.averageCommentsPerUser, 0);
        Assert.assertEquals(0, calculate.averageCommentsPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatistics3(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesList = new ArrayList<>();
        for(int n = 0; n < 90; n++){
            usersNamesList.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(67);
        when(statisticsMock.commentsCount()).thenReturn(100);

        Methods calculate = new Methods(statisticsMock);
        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.74, calculate.averagePostsPerUser, 0.01);
        Assert.assertEquals(1.11, calculate.averageCommentsPerUser, 0.01);
        Assert.assertEquals(1.49, calculate.averageCommentsPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatistics4(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesList = new ArrayList<>();
        for(int n = 0; n < 90; n++){
            usersNamesList.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(67);
        when(statisticsMock.commentsCount()).thenReturn(0);

        Methods calculate = new Methods(statisticsMock);
        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.74, calculate.averagePostsPerUser, 0.01);
        Assert.assertEquals(0, calculate.averageCommentsPerUser, 0);
        Assert.assertEquals(0, calculate.averageCommentsPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatistics5(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesList = new ArrayList<>();
        for(int n = 0; n < 90; n++){
            usersNamesList.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(80);
        when(statisticsMock.commentsCount()).thenReturn(13);

        Methods calculate = new Methods(statisticsMock);
        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.89, calculate.averagePostsPerUser, 0.01);
        Assert.assertEquals(0.14, calculate.averageCommentsPerUser, 0.01);
        Assert.assertEquals(0.16, calculate.averageCommentsPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatistics6(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(80);
        when(statisticsMock.commentsCount()).thenReturn(13);

        Methods calculate = new Methods(statisticsMock);
        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, calculate.averagePostsPerUser, 0);
        Assert.assertEquals(0, calculate.averageCommentsPerUser, 0);
        Assert.assertEquals(0.16, calculate.averageCommentsPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatistics7(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesList = new ArrayList<>();
        for(int n = 0; n < 100; n++){
            usersNamesList.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(80);
        when(statisticsMock.commentsCount()).thenReturn(13);

        Methods calculate = new Methods(statisticsMock);
        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.8, calculate.averagePostsPerUser, 0.01);
        Assert.assertEquals(0.13, calculate.averageCommentsPerUser, 0.01);
        Assert.assertEquals(0.16, calculate.averageCommentsPerPost, 0.01);
    }
}
