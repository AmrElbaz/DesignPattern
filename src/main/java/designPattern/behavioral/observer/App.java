package designPattern.behavioral.observer;

import java.util.Scanner;

public class App {
    /*
    *
    * Observer design pattern
    * Model the "independent" functionality with a "subject" abstraction
    * Model the "dependent" functionality with "observer" hierarchy
    * The Subject is coupled only to the Observer base class
    * Observers register themselves with the Subject
    * The Subject broadcasts events to all registered Observers
    * Observers "pull" the information they need from the Subject
    * Client configures the number and type of Observers
    * */
    public static void main(String[] args) throws InterruptedException {
        Subject sub = new Subject();
        // Client configures the number and type of Observers
        new HexObserver(sub);
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        sub.setState(scan.nextInt());
        Thread.sleep(1000);

        new OctObserver(sub);
        Thread.sleep(1000);
            System.out.print("\nEnter a number: ");
            sub.setState(scan.nextInt());

        new BinObserver(sub);
            System.out.print("\nEnter a number: ");
            sub.setState(scan.nextInt());

    }
}
