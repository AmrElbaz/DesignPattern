package designPattern.structural.decorator.decoration;

import designPattern.structural.decorator.ChristmasTreeDecorator;
import designPattern.structural.decorator.christmasTree.ChristmasTree;

public class BubbleLights extends ChristmasTreeDecorator {

    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}