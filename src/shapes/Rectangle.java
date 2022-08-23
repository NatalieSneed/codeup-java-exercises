package shapes;


public class Rectangle extends Quadrilateral implements Measurable {

//    1. protected properties for length and width.
    protected int length;
    protected int width;

//    a constructor that accepts two numbers for the length and width and sets those properties.
public Rectangle(int l, int w) {
    System.out.println(length);
        this.length = l;
    System.out.println(length);
        this.width = w;
    }
//create a getArea method.

    public double getArea() {
        return this.length * this.width;
    }
//  create a getPerimeter method.
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
//Interfaces and Abstract Classes
    @Override
    public double getPerimeter() {
        return 0;
    }
    @Override
    public double getArea() {
        return 0;
    }


}