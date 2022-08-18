package util;
import java.util.Scanner;

//Create an input validation class
public class Input {
    private final Scanner scanner;
    private int number;
    private double dub;
    private String answer;
    private boolean yesNo;

    public Input(){
        this.scanner = new Scanner(System.in);
    }
}
