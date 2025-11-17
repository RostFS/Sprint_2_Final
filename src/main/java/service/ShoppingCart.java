package service;

import model.Food;

public class ShoppingCart {

    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    // общая сумма товаров в корзине без скидки
    public double getTotalWithoutDiscount() {
        double sum = 0.0;
        for (Food food : items) {
            sum += food.getAmount() * food.getPrice();
        }
        return sum;
    }

    // общая сумма товаров в корзине со скидкой
    public double getTotalWithDiscount() {
        double sum = 0.0;
        for (Food food : items) {
            double subtotal = food.getAmount() * food.getPrice();
            double discount = food.getDiscount();      // в процентах
            double discounted = subtotal * (1 - discount / 100.0);
            sum += discounted;
        }
        return sum;
    }

    // общая сумма всех вегетарианских продуктов без скидки
    public double getVegetarianTotalWithoutDiscount() {
        double sum = 0.0;
        for (Food food : items) {
            if (food.isVegetarian()) {
                sum += food.getAmount() * food.getPrice();
            }
        }
        return sum;
    }
}
