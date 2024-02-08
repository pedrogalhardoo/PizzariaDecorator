package com.pizzaria;

/**
 *
 * @author Pedro
 */
public class Ovo extends PizzaDecorator {
    public Ovo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizzaToDecorate.getDescription() + ", Ovo";
    }

    @Override
    public double getCost() {
        return pizzaToDecorate.getCost() + 1.00;
    }
}