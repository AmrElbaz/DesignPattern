package designPattern.creational.singelton;

import java.util.Objects;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){
        System.out.println("An instance has been created");
    }

    public static synchronized ThreadSafeSingleton getInstance(){
       /* if(instance == null){
            instance = new ThreadSafeSingleton();
        }*/
       // this is equivalent to this
        instance = Objects.requireNonNullElse(instance,new ThreadSafeSingleton());
        return instance;
    }
}
