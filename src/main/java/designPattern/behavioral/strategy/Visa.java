package designPattern.behavioral.strategy;

public class Visa implements Payment {
    @Override
    public String calcPayment() {
        return "calculate Payment using visa";
    }
}
