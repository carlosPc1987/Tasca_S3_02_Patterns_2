package org.example.nivel2.application;

import org.example.nivel2.model.StockAgency;
import org.example.nivel2.model.StockAgent;

public class StockMarketManager {

    public void run() {
        StockAgent agent = new StockAgent();

        StockAgency agency1 = new StockAgency("AlphaInvest");
        StockAgency agency2 = new StockAgency("BetaCapital");
        StockAgency agency3 = new StockAgency("GammaFunds");

        agent.addObserver(agency1);
        agent.addObserver(agency2);
        agent.addObserver(agency3);

        System.out.println(" Market goes UP");
        agent.setMarketStatus("UP");

        System.out.println(" BetaCapital unsubscribes");
        agent.removeObserver(agency2);

        System.out.println(" Market goes DOWN");
        agent.setMarketStatus("DOWN");
    }
}