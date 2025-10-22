package org.example.nivel1.interfaces;

import org.example.nivel1.model.Pizza;

public interface PizzaBuilder {
    void buildDough();
    void buildSauce();
    void buildTopping();
    Pizza getPizza();
}