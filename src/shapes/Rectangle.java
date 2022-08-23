package shapes;

//rectangle class inside the shapes package
public class Rectangle extends Quadrilateral implements Measurable {
//    //    ->Inheritance & Polymorphism:
//    //    protected properties for length & width
//    protected int length;
//    protected int width;

    //    constructor that accepts 2 #'s for length & width; & set those properties
//    public Rectangle(int length, int width) {
//        System.out.println(length);
//        this.length = length;
//        System.out.println(length);
//        this.width = width;
//    }
//    create getArea method
//    public int getArea() {
//        int area = this.length * this.width;
//        return area;
//    }
//create a getPerimeter method
//    public int getPerimeter() {
//        int perimeter = (this.length * 2) + (this.width * 2);
//        return perimeter;
//    }

//Interfaces & Abstract Classes Exercise Methods

    @Override
public double getPerimeter() {
    return 0;
        }


@Override
public double getArea() {
    return 0;
        }
        public void setLength(int length) {

        }
        @Override
        public void setWidth(int width) {

        }
    }
