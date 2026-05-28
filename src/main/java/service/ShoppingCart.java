package service;
import model.Food;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            totalPrice = totalPrice + products[i].getPrice() * products[i].getAmount();
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount() {
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            totalPrice = totalPrice + products[i].getPrice() * products[i].getAmount() * (1 - products[i].getDiscount() / 100);
        }
        return totalPrice;
    }

    public double getTotalVegetarianPrice() {
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getIsVegetarian()) {
                totalPrice = totalPrice + products[i].getPrice() * products[i].getAmount();
            }
        }
        return totalPrice;
    }
}