package designPattern.creational.abstractfactory;

import designPattern.creational.abstractfactory.animalfamily.IAnimal;
import designPattern.creational.abstractfactory.animalfamily.impl.DuckImpl;
import designPattern.creational.abstractfactory.colorfamily.IColor;

public class Main {
    public static void main(String[] args) {
        AbstractFactory animal = FactoryProvider.getFactory("animal");
        IAnimal duck = ((IAnimal) animal.create("duck"));
        System.out.println(duck.getType() + "     " + duck.makeSound());

        AbstractFactory color = FactoryProvider.getFactory("color");
        IColor white = (IColor) color.create("white");
        System.out.println(white.getColor());
    }
}
