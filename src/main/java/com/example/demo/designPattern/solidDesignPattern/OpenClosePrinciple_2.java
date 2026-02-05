package com.example.demo.designPattern.solidDesignPattern;

//Open/Closed Principle
//This principle states that "Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification" which means you should be able to extend a class behavior, without modifying it.

//Instead of modifying the existing PaymentProcessor class to add PayPal support,
// you can create a new class called PayPalPaymentProcessor that extends the PaymentProcessor class. This way, the PaymentProcessor class remains closed for modification but open for extension, adhering to the Open-Closed Principle.
public class OpenClosePrinciple_2 {

}

abstract class Payment {
    abstract void payment();
}

class CreditCardPayment extends Payment {
    @Override
    public void payment() {
        System.out.println("CreditCard payment!!");
    }
}
// Instead of modifing in existing class create new class and extend existing class to new functionality!!

class PaypalPayment extends Payment {
    @Override
    public void payment() {
        System.out.println("Paypal payment!!");
    }
}


