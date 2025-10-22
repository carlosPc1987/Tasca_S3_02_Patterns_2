package org.example.nivel3.model;

import org.example.nivel3.interfaces.PaymentMethod;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public String pay() {
        return "Paid with Credit Card";
    }
}
