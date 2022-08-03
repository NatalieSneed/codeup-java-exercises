import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.println("("The value of pi is approximately, ");
//        System.out.format("%.2f%n", pi);
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter 3 words, please: ");
//    //        int number = scanner.nextInt();
//        String threeWords = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + threeWords + "\" <--");
// reset scanner after using it...
//        scanner.nextLine();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the room: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the Venus room: ");
        double width = scanner.nextDouble();
//        int number = parseInt(width);
        //Area = length*width;
        double area = length*width;
        System.out.println("Area of the Venus room: "+area);


    }
}

