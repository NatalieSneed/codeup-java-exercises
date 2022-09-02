package util;
import java.util.Scanner;

//Create an input validation class
public class Input {
    private Scanner scanner = new Scanner(System.in);

// the class should have the following methods all which return command line input from the user:
//get a string from the user
    public boolean yesNo() {
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public String getString(){
        return this.scanner.nextLine();
    }
    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public int getInt(String s) {
        System.out.println(s);
        return this.scanner.nextInt();
    }

}