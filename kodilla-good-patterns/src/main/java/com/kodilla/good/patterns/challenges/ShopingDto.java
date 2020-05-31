package com.kodilla.good.patterns.challenges;

public class ShopingDto {
    public User user;
    public boolean isBought;

    public ShopingDto(final User user, final boolean isBought) {
        this.user = user;
        this.isBought = isBought;
    }

    public User getUser() {
        return user;
    }

    public boolean isBought() {
        return isBought;
    }
}
