package designPattern.creational.abstractfactory.animalfamily.impl;

import designPattern.creational.abstractfactory.animalfamily.IAnimal;

public class DuckImpl implements IAnimal {
    public String getType() {
        return "Duck";
    }

    public String makeSound() {
        return "Squeks";
    }
}
