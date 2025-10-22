
package org.example.nivel2.model;

import org.example.nivel2.interfaces.StockObserver;

public class StockAgency implements StockObserver {
    private final String name;

    public StockAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(String marketStatus) {
        System.out.println("Agency " + name + " notified: Market is " + marketStatus);
    }
}