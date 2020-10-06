package designPattern.behavioral.templateMethod;

public class App {
    public static void main(String[] args) {
        new NetOrder().processOrder(false);
        System.out.println();
        new StoreOrder().processOrder(true);
    }
}
