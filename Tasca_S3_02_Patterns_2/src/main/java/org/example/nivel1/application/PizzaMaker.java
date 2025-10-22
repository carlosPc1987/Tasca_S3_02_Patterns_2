package org.example.nivel1.application;


import org.example.nivel1.model.HawaiianPizzaBuilder;
import org.example.nivel1.model.Pizza;
import org.example.nivel1.model.PizzaChef;
import org.example.nivel1.model.VegetarianPizzaBuilder;

public class PizzaMaker {

    public void run() {
        PizzaChef chef = new PizzaChef();


        chef.setBuilder(new HawaiianPizzaBuilder());
        Pizza hawaiian = chef.makePizza();
        System.out.println(" Hawaiian Pizza: " + hawaiian);


        chef.setBuilder(new VegetarianPizzaBuilder());
        Pizza vegetarian = chef.makePizza();
        System.out.println(" Vegetarian Pizza: " + vegetarian);
    }
}