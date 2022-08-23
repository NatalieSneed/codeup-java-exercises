package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        with a main method. Inside the main method.
//        create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
        Rectangle box1 = new Rectangle();
        box1.Rectangle(4, 5);

//        verify that the getPerimeter and getArea methods return 18 and 20, respectively.

        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());

//        create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.

        Rectangle box2 = new Rectangle(5);

//        verify that the getPerimeter and getArea methods return 20 and 25, respectively.

        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

//        verify that the getPerimeter and getArea methods return 20 and 25, respectively.
        System.out.println(box2.getPerimeter());

//    declare a variable of the type Measurable named myShape.
        Square myShape = new Square(5);
    Rectangle myShape2 = new Rectangle();
  myShape.setLength(5);
  System.out.println(myShape.getArea());
  System.out.println(myShape.getLength());

    }
}
