package com.kodilla.good.patterns.challenges;

public class ShopingService {

    public boolean rent(User user, boolean isBought){
        if(isBought){
            System.out.println(user);
            return true;
        } else{
            System.out.println("Product is available");
            return false;
        }
    }
}
