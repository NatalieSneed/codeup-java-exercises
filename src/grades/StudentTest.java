package grades;

import movies.Movie;

import java.util.ArrayList;


public class StudentTest {
//    Test your Student class by creating a StudentTest class, adding a main method and creating Student objects.
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<Integer>();
        Student Chewbacca = new Student("Chewy", grades);
//    Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.
        Chewbacca.addGrade(90);
        Chewbacca.addGrade(80);
        Chewbacca.addGrade(70);
        System.out.println(Chewbacca.getGradeAverage());
    }
}
