package designPattern.structural.adapter.geometricShape.classAdapter;

import designPattern.structural.adapter.geometricShape.impl.Rhombus;
import designPattern.structural.adapter.shape.Shape;

public class RhombusAdapter extends Rhombus implements Shape {
    public RhombusAdapter() {
        super();
    }
      @Override
    public void draw() {
        this.drawShape();
    }
    @Override
    public void resize() {
        System.out.println("Rhombus can't be resized. Please create new one with required values.");
    }
    @Override
    public String description() {
        return "Rhombus object";
    }
}
