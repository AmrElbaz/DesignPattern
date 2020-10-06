package designPattern.behavioral.strategy;

public class CreditCard implements Payment {
    @Override
    public String calcPayment() {
        return "calculated payment using CreditCard";
    }
}
