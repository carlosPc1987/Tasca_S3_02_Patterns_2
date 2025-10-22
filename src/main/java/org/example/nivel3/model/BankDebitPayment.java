package org.example.nivel3.model;

import org.example.nivel3.interfaces.PaymentMethod;

public class BankDebitPayment implements PaymentMethod {
    @Override
    public String pay() {
        return "Paid with Bank Debit";
    }
}