package grades;

import java.util.ArrayList;
import java.util.Collections;
public class Student {
    private final String name;
    public ArrayList<Integer> grades;
    private Double average;

    //    The grades property should be an ArrayList of integers
    public Student(String name, ArrayList<Integer> grades){
        this.name = name;
        this.grades = grades;
        //    It should have private properties for the student's name, and grades.
        //The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList.
    }
    public String getName(){
        return name;
    };
    //    The addGrade method should add the grade to the grades' property.
    public void addGrade(int grade){
        grades.add(grade);

    };
    // returns the average of the students grades

    public double getGradeAverage(){
        double sum = 0;
        for(Integer grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    };
//Test your Student class by creating a StudentTest class, adding a main method and creating Student objects.

public static void main(String[] args) {
    Student yoda = new Student("Yoda", new ArrayList<>());
    yoda.addGrade(86);
    yoda.addGrade(90);
    yoda.addGrade(94);
    System.out.println("grades: " + yoda.grades);
    System.out.println("average: " + yoda.getGradeAverage());

}





}