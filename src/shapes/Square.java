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

    //    override the getArea and getPerimeter methods with the following definitions for a square
    public double getArea() {
        return this.side * this.side;

    }

    public void setLength(int length) {
        this.length = side;
    }

    public void setWidth(int width) {
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public Rectangle getBounds() {
        return null;
    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }

    @Override
    public boolean contains(double x, double y) {
        return false;
    }

    @Override
    public boolean contains(Point2D p) {
        return false;
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return false;
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return false;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return null;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return null;
    }

    @Override
    public void Rectangle(int side, int side1) {

    }
}
