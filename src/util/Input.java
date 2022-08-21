package util;
import java.util.Scanner;

//Create an input validation class
public class Input {
    private final Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }
// the class should have the following methods all which return command line input from the user:

    public String getString(){
        return this.scanner.nextLine();
    }
    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }
}