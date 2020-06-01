package com.kodilla.good.patterns.challenges;

public class FoodService implements ShopingService {
    @Override
    public boolean buy(User user, int productQuantity, String productName) {
        if (productQuantity > 0) {
            System.out.println("Thank you " + user + "." + " You bought " + productQuantity + " pieces of " + productName + ".");
            return true;
        } else {
            return false;
        }
    }
}
