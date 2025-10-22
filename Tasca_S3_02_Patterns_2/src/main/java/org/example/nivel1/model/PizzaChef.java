package org.example.nivel1.model;

import org.example.nivel1.interfaces.PizzaBuilder;

public class PizzaChef {
    private PizzaBuilder builder;

    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza makePizza() {
        builder.buildDough();
        builder.buildSauce();
        builder.buildTopping();
        return builder.getPizza();
    }
}