package designPattern.structural.adapter;

import designPattern.structural.adapter.geometricShape.GeometricShapeObjectAdapter;
import designPattern.structural.adapter.geometricShape.classAdapter.RhombusAdapter;
import designPattern.structural.adapter.geometricShape.classAdapter.TriangleAdapter;
import designPattern.structural.adapter.geometricShape.impl.Rhombus;
import designPattern.structural.adapter.geometricShape.impl.Triangle;
import designPattern.structural.adapter.shape.Drawing;
import designPattern.structural.adapter.shape.impl.Circle;
import designPattern.structural.adapter.shape.impl.Rectangle;

public class App {

    /*
    *
    * adapter design pattern is a structural design pattern that allows two unrelated/uncommon interfaces to work together.
    *  In other words, the adapter pattern makes two incompatible interfaces compatible without changing their existing code.
    *
    *               Two Types of Adapter Design pattern
    *               1 -  Object Adapter Pattern
    *                       - we will use the Java composition, and our adapter contains the source object
    *                       -  In this approach, we create an adapter class that implements the target ( Shape in this case)
    *                          and references the adaptee — GeometricShape in this case.
    *               2 -  Class Adapter Pattern
    *                       - In this approach, we use the Java Inheritance and extend the source class.
    *                       - for this approach, we have to create separate adapters for the Triangle and Rhombus
     *
    * */
    public static void main(String[] args) {
       ////////////////////////////////////////////////////////

        // 1------------------------- Object Adapter Pattern---------------------------------

       /////////////////////////////////////////////////////
        System.out.println("Creating drawing of shapes...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());
        drawing.addShape(new GeometricShapeObjectAdapter(new Triangle()));
        drawing.addShape(new GeometricShapeObjectAdapter(new Rhombus()));
        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();

        ////////////////////////////////////////////////////////

        // 2------------------------- Class Adapter Pattern---------------------------------

        /////////////////////////////////////////////////////

        System.out.println("=========================================");
        Drawing drawing2 = new Drawing();
        drawing2.addShape(new Rectangle());
        drawing2.addShape(new Circle());
        drawing2.addShape(new TriangleAdapter());
        drawing2.addShape(new RhombusAdapter());
        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();
    }

    /*
    *
    * Summary
    * Both approaches have the same output. But:
    *   Class adapters use inheritance and can wrap a class only.
    *        I can't wrap an interface since, by definition, it must be derived from some base class.
    *   Object adapters use the composition and can wrap classes as well as interfaces.
    *        It contains a reference to the class or interfaces object instance.
    *        The object adapter is the easier one and can be applied in most of the scenarios.
    *
    * */
}
