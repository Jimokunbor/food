/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package food;

import java.util.List;

/**
 *
 * @author jimok
 */
public class Food {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    protected String food;
    protected List allegens;

    // Constructor for both food and allegens
    public Food(String food, List allegens) {
        this.food = food;
        this.allegens = allegens;
    }
    void displayAllergens() {
        
        // Create a variable called food and initialize it
        String order = food;
System.out.println("Allergens in " + food + ": " + order);
}

    // Set method
public void order() {
Kitchen.orders.add(this);
}

public void serve() {
Kitchen.orders.remove(this);
}

    String getName(Food food) {
        return null;
        
    }

    @Override
    public String toString() {
        return "Food{" + "food=" + food + ", allegens=" + allegens + '}';
    }
}

