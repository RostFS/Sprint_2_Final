package model;

public class Meat extends Food {

    public Meat(int amount, double price) {
        // мясо НЕ вегетарианское
        super(amount, price, false);
    }
}
