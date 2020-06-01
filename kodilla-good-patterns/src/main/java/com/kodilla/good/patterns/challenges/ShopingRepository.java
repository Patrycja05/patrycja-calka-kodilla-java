package com.kodilla.good.patterns.challenges;

public interface ShopingRepository {

    boolean createOrder(User user, int productQuantity, String productName);
}
