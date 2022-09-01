package grades;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
//    Inside the main method, create a HashMap named students.
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

//        It should have keys that are strings that represent  usernames, and values that are Student objects.


//        Create at least 4 Student objects with at least 3 grades each, and add them to the map.
        Student yoda = new Student("Yoda", new ArrayList<>());
        yoda.addGrade(86);
        yoda.addGrade(90);
        yoda.addGrade(94);
        HashMap<Object, Object> students = new HashMap<>();
        students.put("Yoda", yoda);
        Student luke = new Student("Luke", new ArrayList<>());
        luke.addGrade(96);
        luke.addGrade(90);
        luke.addGrade(94);
        students.put("Luke", luke);
        Student leia = new Student("Leia", new ArrayList<>());
        leia.addGrade(98);
        leia.addGrade(90);
        leia.addGrade(94);
        students.put("Leia", leia);
        Student han = new Student("Han", new ArrayList<>());
        han.addGrade(86);
        han.addGrade(90);
        han.addGrade(84);
        students.put("Han", han);
//        Create the command line interface for the application.
        Scanner scanner = new Scanner(System.in);
//        Print the list of GitHub usernames out to the console, and ask the user which student they would like to see more information about.
        System.out.println("Here are the students in the class:");
        String input = scanner.nextLine();
        System.out.println("Which student would you like to see more information about?" + input);


        if (students.containsKey(input)) {
            System.out.println(input + " has the following grades:");
            Student chosenStudent = (Student) students.get(input);
            System.out.println(chosenStudent.grades);
        } else {
            System.out.println("That student is not in the class.");
        }







        }
    }








