package org.example.classbox;

public class DiscountPrice {

    public double discount(int price, int percentage) {
        double factoredDiscount = price * (percentage * 0.01);
        double finalPrice = price - factoredDiscount;
        System.out.println(finalPrice);
        return finalPrice;
    }
}
