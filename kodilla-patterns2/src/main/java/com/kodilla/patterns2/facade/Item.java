package com.kodilla.patterns2.facade;

import org.springframework.stereotype.Service;

@Service
public class Item {
    private final Long productId;
    private final double qty;

    public Item(Long productId, double qty){
        this.productId = productId;
        this.qty = qty;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQty() {
        return qty;
    }
}
