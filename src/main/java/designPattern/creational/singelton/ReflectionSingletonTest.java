package designPattern.creational.singelton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
    public static void main(String[] args) {
        ThreadSafeSingleton instanceOne = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton instanceTwo = null;
        try {
            Constructor[] constructors = ThreadSafeSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                System.out.println(constructor.toString());
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (ThreadSafeSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
