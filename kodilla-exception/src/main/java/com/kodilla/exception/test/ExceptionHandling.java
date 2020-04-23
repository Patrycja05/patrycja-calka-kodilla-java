package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(3, 1.5);
        } catch (Exception e) {
            System.out.println("Choose another number.");
        } finally {
            System.out.println("Second exception test.");
        }
    }
}
