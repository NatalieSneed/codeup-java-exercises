package groceries;

import java.util.Scanner;

public class Grocery {
//    Create a grocery list command line application.
public class GroceryItem implements Comparable {
    private String name;
    private String category;
    private int quantity;

    public GroceryItem(String name, String category, int quantity) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "GroceryItem{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}





