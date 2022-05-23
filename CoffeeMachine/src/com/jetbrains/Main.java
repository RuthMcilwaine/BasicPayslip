package com.jetbrains;

import java.util.Collections;
import java.util.Scanner;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Report report = new Report();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nChoose a drink: 1.Tea, 2.Coffee, 3.Hot Choc, 4.Orange Juice");
            String drinkInput = scanner.nextLine();

            coffeeMachine.setDrink(drinkInput);

            if (coffeeMachine.isHotDrink()) {
                System.out.println("Would you like it extra hot? Y or N");
                String hotInput = scanner.nextLine();
                coffeeMachine.setHot(hotInput);

                System.out.println("How many sugar: 0-5");
                String sugarInput = scanner.nextLine();
                coffeeMachine.setSugar(sugarInput);
            }

            Order order = coffeeMachine.getDrinkOrder();
            System.out.println("Total cost:" + order.getCost());
            System.out.println("Enter the cash amount:");
            String cashInput = scanner.nextLine();
            order.setCashAmount(Float.parseFloat(cashInput));

            System.out.println(order.displayOrder());
            report.addOrder(order);

            System.out.println("\nPrint report? Y or N");
            String reportInput = scanner.nextLine();

            if(reportInput.equals("Y")) {
                System.out.print(report.displayReport());
            }


        } while (true);
    }
}
