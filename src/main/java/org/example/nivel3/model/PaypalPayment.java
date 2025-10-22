package org.example.nivel3.model;

import org.example.nivel3.interfaces.PaymentMethod;

public class PaypalPayment implements PaymentMethod {
    @Override
    public String pay() {

        return "Paid with PayPal";
    }
}
