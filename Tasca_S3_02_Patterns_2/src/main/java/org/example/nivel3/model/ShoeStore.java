package org.example.nivel3.model;

import org.example.nivel3.interfaces.PaymentMethod;

public class ShoeStore {

    public String sellShoes(PaymentMethod method) {
        PaymentGateway gateway = new PaymentGateway();
        return gateway.executePayment(method);
    }
}
