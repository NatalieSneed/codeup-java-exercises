package movies;

import util.Input;

import java.util.Scanner;
import java.util.Arrays;
import static movies.MoviesArray.findAll;
public class MoviesApplication {
    public static final int INVALID_CHOICE = -1;
    public static final int EXIT_CHOICE = 0;

    static Movie[] movies;
    public static void main(String[] args) {
//        get all movies from the array
        movies = MoviesArray.findAll();
        Input input = new Input();
        System.out.println("Welcome to the Movies Application");

//        keep looping until user exits
        int choice = INVALID_CHOICE;
        while (choice != EXIT_CHOICE) {
            printMenu();

            choice = input.getInt("Enter your choice: ");

            doChoice(choice);
        }
    }

    private static void printMenu() {
        System.out.println("1. List all movies");
        System.out.println("2. Add a movie");
        System.out.println("3. Remove a movie");
        System.out.println("4. Find a movie");
        System.out.println("5. Find all movies in a category");
        System.out.println("0. Exit");
    }


    private static void displayMenu() {
        System.out.println("""
                       
                What would you like to do?

                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the sci-fi category
                6 - add a movie

                Enter your choice:""");
    }
    private static void doChoice(int choice) {
        switch (choice) {
            case 1 -> viewAllMovies();
            case 2 -> viewMoviesInCategory("animated");
            case 3 -> viewMoviesInCategory("drama");
            case 4 -> viewMoviesInCategory("horror");
            case 5 -> viewMoviesInCategory("sci-fi");
            case 6 -> addMovie();
        }
    }

    private static void viewMoviesInCategory(String animated) {
//        Movie[] moviesInCategory = findAll(movies, movie -> movie.getCategory().equals(animated));
//        System.out.println(Arrays.toString(moviesInCategory));
    }

    private static void viewAllMovies() {
        System.out.println("Here are all the movies:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    private static void addMovie() {
        Input input = new Input();
        String name = input.getString("Enter the name of the movie: ");
        String category = input.getString("Enter the category of the movie: ");
        Movie movie = new Movie(name, category);
//        MoviesArray.add(movie);
    }

}



