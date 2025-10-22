package org.example.nivel1.model;

import org.example.nivel1.interfaces.PizzaBuilder;

public class HawaiianPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public HawaiianPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildDough() {
        pizza.setDough("suave");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("dulce");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("piña y jamón");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
