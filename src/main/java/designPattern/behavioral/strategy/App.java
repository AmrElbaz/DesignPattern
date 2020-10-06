package designPattern.behavioral.strategy;

public class App {
    public static void main(String[] args) {
        System.out.println(new Strategy(new CreditCard()).calcPayment());
        System.out.println(new Strategy(new Visa()).calcPayment());
    }
}
