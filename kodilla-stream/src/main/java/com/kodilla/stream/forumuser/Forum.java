package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Paul", 'M', 1990, 10, 10, 2));
        userList.add(new ForumUser(2, "Roman", 'M', 2005, 06, 19, 456));
        userList.add(new ForumUser(3, "Betty", 'K', 1995, 12, 11, 5));
        userList.add(new ForumUser(4, "James", 'M', 1998, 03, 12, 0));
        userList.add(new ForumUser(5, "Maria", 'K', 1978, 10, 16, 78));
        userList.add(new ForumUser(6, "Cristina", 'K', 2010, 03, 20, 45));
        userList.add(new ForumUser(7, "Teodoro", 'M', 1992, 01, 01, 90));
        userList.add(new ForumUser(8, "John", 'M', 1993, 04, 28, 1));

    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}
