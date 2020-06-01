package com.kodilla.good.patterns.challenges;

public class FoodRepository implements ShopingRepository {
    @Override
    public boolean createOrder(User user, int productQuantity, String productName) {
        if (productQuantity > 0) {
            System.out.println("New order of " + productName + " for " + user + ".");
            return true;
        } else {
            return false;
        }
    }
}
