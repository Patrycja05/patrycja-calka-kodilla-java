package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        //When
        Logger.getInstance().log("25.04.2020, 14:50");
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("25.04.2020, 14:50", result);
    }
}
