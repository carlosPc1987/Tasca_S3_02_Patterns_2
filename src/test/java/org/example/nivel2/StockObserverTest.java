package org.example.nivel2;

import org.example.nivel2.interfaces.StockObserver;
import org.example.nivel2.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockObserverTest {

    @Test
    void whenStockGoesUp_thenAgenciesAreNotified() {
        StockAgent agent = new StockAgent();
        TestAgency agency1 = new TestAgency();
        TestAgency agency2 = new TestAgency();

        agent.addObserver(agency1);
        agent.addObserver(agency2);

        agent.setMarketStatus("UP");

        assertEquals("UP", agency1.getLastNotification());
        assertEquals("UP", agency2.getLastNotification());
    }

    @Test
    void whenStockGoesDown_thenAgenciesAreNotified() {
        StockAgent agent = new StockAgent();
        TestAgency agency = new TestAgency();

        agent.addObserver(agency);
        agent.setMarketStatus("DOWN");

        assertEquals("DOWN", agency.getLastNotification());
    }
    static class TestAgency implements StockObserver {
        private String lastNotification;

        @Override
        public void update(String marketStatus) {
            this.lastNotification = marketStatus;
        }

        public String getLastNotification() {
            return lastNotification;
        }
    }
}
