package designPattern.structural.decorator;

import designPattern.structural.decorator.christmasTree.ChristmasTree;
import designPattern.structural.decorator.christmasTree.impl.ChristmasTreeImpl;
import designPattern.structural.decorator.decoration.BubbleLights;
import designPattern.structural.decorator.decoration.Garland;

public class App {
    public static void main(String[] args) {
        ChristmasTree christmasTree = new Garland(new ChristmasTreeImpl());
        System.out.println(christmasTree.decorate());
        System.out.println("=========================================================================");
        ChristmasTree christmasTree2 = new BubbleLights(new Garland(new ChristmasTreeImpl()));
        System.out.println(christmasTree2.decorate());
        System.out.println("=========================================================================");
        ChristmasTree christmasTree3 = new BubbleLights(new Garland(new BubbleLights(new BubbleLights(new ChristmasTreeImpl()))));
        System.out.println(christmasTree3.decorate());
    }
}
