package designPattern.creational.singelton;

public class App {
    /*
    *
    *   Singleton Pattern
    *   Singleton pattern restricts the instantiation of a class
    *       and ensures that only one instance of the class exists in the java virtual machine.
    *
    *   The singleton class must provide a global access point to get the instance of the class.
    *   Singleton pattern is used for logging, drivers objects, caching and thread pool.
    *
    *                               NOTE This can be destroyed be Reflection
    *
    * */
    public static void main(String[] args) {
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();
        System.out.println(threadSafeSingleton + "   " + threadSafeSingleton2);
        System.out.println(threadSafeSingleton == threadSafeSingleton2);


    }
}
