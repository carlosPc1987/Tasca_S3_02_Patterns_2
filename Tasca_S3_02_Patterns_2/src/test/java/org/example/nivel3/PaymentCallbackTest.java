package org.example.nivel3;

import org.example.nivel3.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCallbackTest {

    @Test
    void whenPayWithCreditCard_thenCallbackIsExecuted() {
        ShoeStore store = new ShoeStore();
        String result = store.sellShoes(new CreditCardPayment());
        assertEquals("Paid with Credit Card", result);
    }

    @Test
    void whenPayWithPaypal_thenCallbackIsExecuted() {
        ShoeStore store = new ShoeStore();
        String result = store.sellShoes(new PaypalPayment());
        assertEquals("Paid with PayPal", result);
    }

    @Test
    void whenPayWithBankDebit_thenCallbackIsExecuted() {
        ShoeStore store = new ShoeStore();
        String result = store.sellShoes(new BankDebitPayment());
        assertEquals("Paid with Bank Debit", result);
    }
}