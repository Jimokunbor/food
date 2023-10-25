/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package food;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jimok
 */
public class Kitchen {
public static List<Food> orders = new ArrayList<>();
public static void serveOrders() {
    System.out.println("Serving orders...");
    for (Food food : orders) {
        System.out.println("Serving " + food.getName(food));
        food.serve();
    }
  }
}
