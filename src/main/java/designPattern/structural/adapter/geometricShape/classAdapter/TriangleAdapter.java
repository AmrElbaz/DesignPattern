package designPattern.structural.adapter.geometricShape.classAdapter;

import designPattern.structural.adapter.geometricShape.impl.Triangle;
import designPattern.structural.adapter.shape.Shape;

public class TriangleAdapter extends Triangle implements Shape {
    public TriangleAdapter() {
        super();
    }
    @Override
    public void draw() {
        this.drawShape();
    }
    @Override
    public void resize() {
        System.out.println("Triangle can't be resized. Please create new one with required values.");
    }
    @Override
    public String description() {
        return "Triangle object";
    }

}
