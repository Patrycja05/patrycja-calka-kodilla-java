package com.kodilla.good.patterns.challenges;

public class Request {
    private User user;
    private String product;

    public Request(final User user, final String product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public String getProduct() {
        return product;
    }
}
