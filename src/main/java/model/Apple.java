package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {

    private String colour; // цвет яблок

    public Apple(int amount, double price, String colour) {
        // яблоки вегетарианские
        super(amount, price, true);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        // для красных яблок скидка 60%
        if (Colour.RED.equalsIgnoreCase(colour)) {
            return Discount.RED_APPLE;
        }
        return 0.0;
    }
}
