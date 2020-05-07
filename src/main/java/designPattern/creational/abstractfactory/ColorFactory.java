package designPattern.creational.abstractfactory;

import designPattern.creational.abstractfactory.colorfamily.IColor;
import designPattern.creational.abstractfactory.colorfamily.impl.BlackImpl;
import designPattern.creational.abstractfactory.colorfamily.impl.WhiteImpl;

public class ColorFactory implements AbstractFactory<IColor> {
    public IColor create(String type) {
        if ("white".equalsIgnoreCase(type)) {
            return new WhiteImpl();
        } else if ("black".equalsIgnoreCase(type)) {
            return new BlackImpl();
        }

        return null;
    }
}
