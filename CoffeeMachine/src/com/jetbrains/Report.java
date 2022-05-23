package com.jetbrains;

import java.util.*;
import java.util.HashMap;

public class Report {
    private List<Order> orderItems = new ArrayList<>();
//    HashMap<String, Float> map = new HashMap<String, Float>();

    public void addOrder(Order order) {
        orderItems.add(order);
    }

    public String displayReport() {

        float sumOfCosts = 0;

        int countTea = 0;
        int countCoffee = 0;
        int countHChoc = 0;
        int countOJuice = 0;

        for (Order order : orderItems) {
            String drinkType = order.getDrink().toString();
            sumOfCosts += order.getCost();
            if (drinkType.equals("Tea")) {
                countTea++;
            }
            if (drinkType.equals("Coffee")) {
                countCoffee++;
            }
            if (drinkType.equals("HotChoc")) {
                countHChoc++;
            }
            if (drinkType.equals("OJuice")) {
                countOJuice++;
            }

        }

        return "Total drinks ordered: " + countTea + " tea, " + countCoffee + " coffee, " + countHChoc + " hot chocolate, " + countOJuice + " orange juice, "
                + "\nTotal money earned: $ " + sumOfCosts + "\n";
    }

}


