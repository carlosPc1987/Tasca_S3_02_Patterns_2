package org.example.nivel1.model;

import org.example.nivel1.interfaces.PizzaBuilder;

public class VegetarianPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public VegetarianPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildDough() {
        pizza.setDough("integral");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("tomate");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("pimientos, cebolla, champiñones");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}