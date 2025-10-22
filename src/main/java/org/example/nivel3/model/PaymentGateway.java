package org.example.nivel3.model;

import org.example.nivel3.interfaces.PaymentMethod;

public class PaymentGateway {

    public String executePayment(PaymentMethod method) {
        return method.pay();
    }
}
