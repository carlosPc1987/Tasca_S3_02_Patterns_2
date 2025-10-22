package org.example.nivel2.model;

import org.example.nivel2.interfaces.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class StockAgent {
    private final List<StockObserver> observers = new ArrayList<>();
    private String marketStatus;

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    public void setMarketStatus(String status) {
        this.marketStatus = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(marketStatus);
        }
    }
}