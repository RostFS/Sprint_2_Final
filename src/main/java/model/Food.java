package model;

public abstract class Food implements Discountable {

    // количество продукта в килограммах
    protected int amount;

    // цена за единицу (за 1 кг)
    protected double price;

    // флаг: продукт вегетарианский или нет
    protected boolean isVegetarian;

    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    // по умолчанию скидки нет
    @Override
    public double getDiscount() {
        return 0.0;
    }
}
