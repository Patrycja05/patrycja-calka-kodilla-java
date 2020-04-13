package com.kodilla.testing.forum.statistics;

import java.util.List;

public class Methods {
    Statistics statistics;
    double average1;
    double average2;
    double average3;

    public Methods(Statistics statistics){
        this.statistics = statistics;
     }

    public void calculateAdvStatistics(Statistics statistics) {
        double numberOfPosts = statistics.postsCount();
        double numberOfUsers = statistics.usersNames().size();
        double numberOfComments = statistics.commentsCount();
        if(numberOfPosts == 0 || numberOfUsers == 0) {
            average1 = 0;
        } else {
            average1 = numberOfPosts / numberOfUsers;
        }
        if(numberOfComments == 0 || numberOfUsers == 0) {
            average2 = 0;
        } else {
            average2 = numberOfComments / numberOfUsers;;
        }
        if(numberOfPosts == 0 || numberOfComments == 0) {
            average3 = 0;
        } else {
            average3 = numberOfComments / numberOfPosts;
        }
    }

    public void showStatistics() {
        System.out.println(average1);
        System.out.println(average2);
        System.out.println(average3);
    }
}
