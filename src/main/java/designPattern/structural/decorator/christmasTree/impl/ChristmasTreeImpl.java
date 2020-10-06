package designPattern.structural.decorator.christmasTree.impl;

import designPattern.structural.decorator.christmasTree.ChristmasTree;

public class ChristmasTreeImpl implements ChristmasTree {

    @Override
    public String decorate() {
        return "Christmas tree";
    }
}