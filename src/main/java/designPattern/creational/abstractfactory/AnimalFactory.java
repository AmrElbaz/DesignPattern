package designPattern.creational.abstractfactory;

import designPattern.creational.abstractfactory.animalfamily.IAnimal;
import designPattern.creational.abstractfactory.animalfamily.impl.DogImpl;
import designPattern.creational.abstractfactory.animalfamily.impl.DuckImpl;

public class AnimalFactory implements AbstractFactory<IAnimal> {
    public IAnimal create(String type) {
        if ("Dog".equalsIgnoreCase(type)) {
            return new DogImpl();
        } else if ("Duck".equalsIgnoreCase(type)) {
            return new DuckImpl();
        }

        return null;
    }
}
