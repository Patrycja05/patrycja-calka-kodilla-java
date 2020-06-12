package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User user1 = new Millenials("Adam123");
        User user2 = new YGeneration("Collin1");
        User user3 = new ZGeneration("Steven375");

        //When
        String post1 = user1.sharePost();
        String post2 = user2.sharePost();
        String post3 = user3.sharePost();

        //Then
        Assert.assertEquals("Twitter", post1);
        Assert.assertEquals("Facebook", post2);
        Assert.assertEquals("Snapchat", post3);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User user4 = new Millenials("Adam123");

        //When
        user4.setSocialPublisher(new SnapchatPublisher());
        String post4 = user4.sharePost();

        //Then
        Assert.assertEquals("Snapchat", post4);
    }
}
