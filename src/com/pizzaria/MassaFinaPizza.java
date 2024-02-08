package com.pizzaria;

/**
 *
 * @author Pedro
 */
public class MassaFinaPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Pizza de Massa Fina";
    }

    @Override
    public double getCost() {
        return 10.00; // valor base para massa fina
    }
}