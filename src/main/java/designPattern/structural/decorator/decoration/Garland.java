package designPattern.structural.decorator.decoration;

import designPattern.structural.decorator.ChristmasTreeDecorator;
import designPattern.structural.decorator.christmasTree.ChristmasTree;

public class Garland extends ChristmasTreeDecorator {

    public Garland(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Garland";
    }
}