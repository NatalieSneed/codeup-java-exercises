package shapes;

import java.awt.*;

abstract class Quadrilateral extends Shape implements Measurable {

    //     1. protected properties for length and width.
    protected int length;
    protected int width;

    //     a constructor that accepts two numbers for the length and width and sets those properties.
    public Quadrilateral(int l, int w) {
        this.length = l;
        this.width = w;
    }

    public Quadrilateral() {

    }

    //     methods for getting the length and width.
    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    //     abstract methods for setting the length and width.
    public abstract void setLength(int length);

    public abstract void setWidth(int width);
    @Override
    public double getArea() {
        return  2 * (this.length + this.width);
    }
    @Override
    public double getPerimeter() {
        return this.length * this.width;
    }
}




