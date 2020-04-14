package com.kodilla.testing.forum.statistics;

import java.util.List;

public class Methods {
    Statistics statistics;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public Methods(Statistics statistics){
        this.statistics = statistics;
     }

    public void calculateAdvStatistics(Statistics statistics) {
        double numberOfPosts = statistics.postsCount();
        double numberOfUsers = statistics.usersNames().size();
        double numberOfComments = statistics.commentsCount();
        if(numberOfPosts == 0 || numberOfUsers == 0) {
            averagePostsPerUser = 0;
        } else {
            averagePostsPerUser = numberOfPosts / numberOfUsers;
        }
        if(numberOfComments == 0 || numberOfUsers == 0) {
            averageCommentsPerUser = 0;
        } else {
            averageCommentsPerUser = numberOfComments / numberOfUsers;;
        }
        if(numberOfPosts == 0 || numberOfComments == 0) {
            averageCommentsPerPost = 0;
        } else {
            averageCommentsPerPost = numberOfComments / numberOfPosts;
        }
    }

    public void showStatistics() {
        System.out.println(averageCommentsPerUser);
        System.out.println(averageCommentsPerUser);
        System.out.println(averageCommentsPerPost);
    }
}
