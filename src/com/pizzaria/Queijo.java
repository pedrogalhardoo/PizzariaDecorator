package com.pizzaria;

/**
 *
 * @author Pedro
 */
public class Queijo extends PizzaDecorator {
    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizzaToDecorate.getDescription() + ", Queijo";
    }

    @Override
    public double getCost() {
        return pizzaToDecorate.getCost() + 1.50;
    }
}