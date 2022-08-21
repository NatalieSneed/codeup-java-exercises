
// import java.util.Arrays;

// public class ArraysExercises {
//     public static void main(String[] args) {
// //create an array that holds 3 Person objects.
//         Person[] persons = new Person[3];
//         persons[0] = new Person("Fred");
//         persons[1] = new Person("Barney");
//         persons[2] = new Person("Wilma");

// //        iterate through the array & print out the name of each person in the array
//         for (Person person : persons){
//             System.out.println(person.getName());
//         }
// //  create a method to addPerson.
// //            1. accept an array of Person objects & single person object
//         addPerson(persons, new Person("Betty"));
//     }
// //            2. return an array length is 1> the passed array
//     public static Person[] addPerson(Person[] persons, Person person){
//         Person[] newPersons = new Person[persons.length + 1];
//         for (int i = 0; i < persons.length; i++){
//             newPersons[i] = persons[i];
//         }
//         newPersons[newPersons.length - 1] = person;
//         return newPersons;
//     }
// }
