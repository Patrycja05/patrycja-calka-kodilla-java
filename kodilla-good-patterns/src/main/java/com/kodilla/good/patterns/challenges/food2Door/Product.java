package com.kodilla.good.patterns.challenges.food2Door;

public class Product {
    public int productQuantity;
    public String productName;

    public Product(int productQuantity, String productName) {
        this.productQuantity = productQuantity;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "productQuantity=" + productQuantity +
                ", productName='" + productName;
    }
}
