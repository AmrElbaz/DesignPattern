package designPattern.creational.abstractfactory.animalfamily.impl;

import designPattern.creational.abstractfactory.animalfamily.IAnimal;

public class DogImpl implements IAnimal {
    public String getType() {
        return "Dog";
    }

    public String makeSound() {
        return "wowowowo";
    }
}
