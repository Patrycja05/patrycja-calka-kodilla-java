package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TasksDatabase implements Observable {
    private final List<Observer> mentors;
    private final List<String> tasks;
    private final String name;

    public TasksDatabase(String name) {
        tasks = new ArrayList<>();
        mentors = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String taskDescription){
        tasks.add(taskDescription);
        notifyMentor();
    }

    @Override
    public void sendTaskToVerification(Observer observer){
        mentors.add(observer);
    }

    @Override
    public void deleteTask(Observer observer){
        mentors.remove(observer);
    }

    @Override
    public void notifyMentor(){
        for(Observer observer : mentors){
            observer.update(this);
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
