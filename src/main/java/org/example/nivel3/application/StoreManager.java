package org.example.nivel3.application;


import org.example.nivel3.model.BankDebitPayment;
import org.example.nivel3.model.CreditCardPayment;
import org.example.nivel3.model.PaypalPayment;
import org.example.nivel3.model.ShoeStore;


public class StoreManager {

    public void run() {
        ShoeStore store = new ShoeStore();

        System.out.println(store.sellShoes(new CreditCardPayment()));
        System.out.println(store.sellShoes(new PaypalPayment()));
        System.out.println(store.sellShoes(new BankDebitPayment()));
    }
}
