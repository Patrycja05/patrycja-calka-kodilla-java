package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> numbers;
    public ArrayList<Integer> numbers1;

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        for (Integer number: numbers) {
            if (number % 2 == 0) {
                numbers1.add(number);
            }
        }
        return numbers1;
    }
}
