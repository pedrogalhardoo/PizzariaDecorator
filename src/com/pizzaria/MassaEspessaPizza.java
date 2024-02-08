package com.pizzaria;

/**
 *
 * @author Pedro
 */
public class MassaEspessaPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Pizza de Massa Espessa";
    }

    @Override
    public double getCost() {
        return 12.00; // valor base para massa espessa
    }
}