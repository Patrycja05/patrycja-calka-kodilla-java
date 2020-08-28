package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void sendTaskToVerification(Observer observer);
    void deleteTask(Observer observer);
    void notifyMentor();
}
