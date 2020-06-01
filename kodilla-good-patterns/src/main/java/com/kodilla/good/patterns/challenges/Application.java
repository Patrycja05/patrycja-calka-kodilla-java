package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        User user1 = new User("Ben", "ben123");

        ShoppingProcessor shoppingProcessor = new ShoppingProcessor(new MailService(), new FoodService(), new FoodRepository());

        shoppingProcessor.process(user1, 50, "eggs");
    }
}
