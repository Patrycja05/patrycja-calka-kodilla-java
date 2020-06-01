package com.kodilla.good.patterns.challenges.food2Door;

public class Food2DoorMain {

    public static void main(String[] args) {

        Product product1 = new Product(20, "Oat milk");
        Product product2 = new Product(3, "Gluten-free flour");
        Product product3 = new Product(70, "Vegan burger");
        Order order1 = new Order("Extra Food", "Ben", product1);
        Order order2 = new Order("Gluten Free", "Tom", product2);
        Order order3 = new Order("Healthy Shop", "Natasha", product3);

        Warehouse warehouse = new Warehouse();

        warehouse.takeOrder(order1);
        warehouse.takeOrder(order2);
        warehouse.takeOrder(order3);
    }
}
