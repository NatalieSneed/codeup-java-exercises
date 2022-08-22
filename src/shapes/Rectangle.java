package shapes;

public class Rectangle extends Quadrilateral {
    //    protected properties for length & width
    protected double length;
    protected double width;

    //    constructor that accepts 2 #'s for length & width
    public Rectangle(double length, double width) {
        System.out.println(length);
        this.length = length;
        System.out.println(length);
        this.width = width;
    }
}