package com.pizzaria;

/**
 *
 * @author Pedro
 */
public class Tomate extends PizzaDecorator {
    public Tomate(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizzaToDecorate.getDescription() + ", Tomate";
    }

    @Override
    public double getCost() {
        return pizzaToDecorate.getCost() + 0.75;
    }
}