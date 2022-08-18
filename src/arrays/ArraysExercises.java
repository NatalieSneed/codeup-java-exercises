import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        Arrays.toString(array) returns a copy of the given array w/ the specified length
//        System.out.println(Arrays.toString(numbers));

//        Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

         String [] people = {};
            for(Person person : people){
                System.out.println(person.getName());
            }
        }
        Person[] people = new Person[3];
        people[0] = new Person("John");
        people[1] = new Person("Jane");
        people[2] = new Person("Joe");
        printNames(people);
    }
}
