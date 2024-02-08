package com.pizzaria;

/**
 *
 * @author Pedro
 */
public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizzaToDecorate;

    public PizzaDecorator(Pizza pizza) {
        this.pizzaToDecorate = pizza;
    }

    public String getDescription() {
        return pizzaToDecorate.getDescription();
    }

    public double getCost() {
        return pizzaToDecorate.getCost();
    }
}
