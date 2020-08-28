package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String username;
    private int updateCount;

    public Mentor(String username){
        this.username = username;
    }

    @Override
    public void update(TasksDatabase tasksDatabase){
        System.out.println(tasksDatabase.getName() + " sends you a new task to verify." + "\n" + " (total: " + tasksDatabase.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
