package com.kodilla.good.patterns.challenges;

public class ShoppingProcessor {
    private InformationService informationService;
    private ShopingService shopingService;
    private ShopingRepository shopingRepository;

    public ShoppingProcessor(final InformationService informationService, final ShopingService shopingService, final ShopingRepository shopingRepository) {
        this.informationService = informationService;
        this.shopingService = shopingService;
        this.shopingRepository = shopingRepository;
    }

    public ShopingDto process(final User user, final int productQuantity, final String productName) {
        boolean isBought = shopingService.buy(user, productQuantity, productName);
        if (isBought) {
            informationService.inform(user);
            shopingRepository.createOrder(user, productQuantity, productName);
            return new ShopingDto(user, true);
        } else {
            return new ShopingDto(user, false);
        }
    }
}
