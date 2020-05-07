package designPattern.creational.prototype;

public class App {
    /*
    *
    *
    *   Design Patterns - Prototype Pattern
    *   The concept is to copy an existing object rather than creating a new instance from scratch,
    *   something that may include costly operations.
    *
    *   steps
    *
    *   Step 1
    *       Create an abstract class implementing Clonable interface.
    *
    * `Step 2
    *       Create concrete classes extending the above class.
    *
    *
    *   Step 3
    *       Create a class to get concrete classes from database and store them in a Hashtable.
    *
    *   Step 4
    *       PrototypePatternDemo uses ShapeCache class to get clones of shapes stored in a Hashtable.
    *
    *
    * */
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("Circle");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("Square");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("Square");
        System.out.println("Shape : " + clonedShape3.getType());

        Shape clonedShape4 = (Shape) ShapeCache.getShape("Square");
        System.out.println("Shape : " + clonedShape3.getType());
        System.out.println(clonedShape3 == clonedShape4);
    }
}
