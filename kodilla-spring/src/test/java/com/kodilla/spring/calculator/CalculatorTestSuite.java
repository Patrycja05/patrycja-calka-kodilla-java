package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");
        //When
        double sum = calculator.add(4,6);
        double sub = calculator.sub(19, 3);
        double div = calculator.div(5,5);
        double mul = calculator.mul(1,19);
        //Then
        Assert.assertEquals(10, sum, 0);
        Assert.assertEquals(16, sub, 0);
        Assert.assertEquals(1, div, 0);
        Assert.assertEquals(19, mul, 0);
    }
}
