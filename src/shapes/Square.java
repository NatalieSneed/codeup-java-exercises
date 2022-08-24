package shapes;

import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Square extends Quadrilateral{
//  1.  Square should define a constructor that accepts one argument, side, and calls the parent's constructor to
private int side;
    public Square(int i) {
        super();
        this.Rectangle(side, side);
        this.side = side;
    }

    @Override
    public void Rectangle(int side, int side1) {

    }

    //    override the getArea and getPerimeter methods with the following definitions for a square
    public double getArea() {
        return this.side * this.side;

    }

    public double getPerimeter() {
        return this.side * 4;
    }

    public void setLength(int length) {
        this.length = side;
    }

    public void setWidth(int width) {
        this.width = side;
    }


}
