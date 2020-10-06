package designPattern.structural.decorator;

import designPattern.structural.decorator.christmasTree.ChristmasTree;

public class ChristmasTreeDecorator implements ChristmasTree {
    private ChristmasTree decoratedChristmasTree;

    public ChristmasTreeDecorator (ChristmasTree decoratedChristmasTree) {
        this.decoratedChristmasTree = decoratedChristmasTree;
    }
    @Override
    public String decorate() {
        return decoratedChristmasTree.decorate();
    }
}
