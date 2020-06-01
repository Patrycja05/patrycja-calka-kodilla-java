package com.kodilla.good.patterns.challenges;

public class User {
    private String userName;
    private String userNick;

    public User(String userName, String userNick) {
        this.userName = userName;
        this.userNick = userNick;
    }

    @Override
    public String toString() {
        return userName;
    }
}
