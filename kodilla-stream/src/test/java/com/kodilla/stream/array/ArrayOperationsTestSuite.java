package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int numbers[] = {2, 34, 22, 23, 1, 90, 44, 36, 2, 10, 1, 45, 9, 7, 12, 56, 3, 56, 7, 90};

        //When
        double calculateAverage = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(27.5, calculateAverage, 0.001);
    }
}
