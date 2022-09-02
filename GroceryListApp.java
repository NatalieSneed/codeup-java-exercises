import java.util.Input;
import Grocery.java;
import GroceryList.java;

public class GroceryListApp {
    //1. A user should be prompted if they would like to create a grocery list. (2)if the user picks yes, they will be prompted if they would like to enter a new item. (3) If the users picks yes, they should be given the following three prompts: (a)Given an ordered list of grocery categories to choose from, select the category. (b)enter the name of the item (c)enter how many of the item
    public static void main(String[] args) {
        Input input = new Input();
        GroceryList groceryList = new GroceryList();
        boolean userContinue = true;
        do {
            System.out.println("Would you like to create a grocery list? (y/n)");
            String userResponse = input.getString();
            if (userResponse.equalsIgnoreCase("y")) {
                System.out.println("Would you like to enter a new item? (y/n)");
                String userResponse2 = input.getString();
                if (userResponse2.equalsIgnoreCase("y")) {
                    System.out.println("Please select a category from the following list: ");
                    System.out.println("1. Produce");
                    System.out.println("2. Meat");
                    System.out.println("3. Dairy");
                    System.out.println("4. Baking");
                    System.out.println("5. Canned Goods");
                    System.out.println("6. Frozen Foods");
                    System.out.println("7. Other");
                    int userResponse3 = input.getInt();
                    System.out.println("Please enter the name of the item: ");
                    String userResponse4 = input.getString();
                    System.out.println("Please enter the quantity of the item: ");
                    int userResponse5 = input.getInt();
                    GroceryItem groceryItem = new GroceryItem(userResponse4, userResponse3, userResponse5);
                    groceryList.addGroceryItem(groceryItem);
                } else {
                    userContinue = false;
                }
            } else {
                userContinue = false;
            }
        } while (userContinue);
        System.out.println(groceryList);
    }
    private ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();
        private Scanner scanner = new Scanner(System.in);
        private Input input = new Input();
        private boolean quit = false;

}
