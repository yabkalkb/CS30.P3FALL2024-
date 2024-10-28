package Mastery;

import java.util.Scanner;

public class MySavings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PiggyBank piggyBank = new PiggyBank();
        boolean running = true;

        while (running) {
            System.out.println("1. Show total in bank.");
            System.out.println("2. Add a penny.");
            System.out.println("3. Add a nickel.");
            System.out.println("4. Add a dime.");
            System.out.println("5. Add a quarter.");
            System.out.println("6. Take money out of bank.");
            System.out.println("Enter Q to quit.");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.printf("Total in bank: $%.2f%n", piggyBank.getTotal());
                    break;
                case "2":
                    piggyBank.addPenny();
                    System.out.println("Added a penny.");
                    break;
                case "3":
                    piggyBank.addNickel();
                    System.out.println("Added a nickel.");
                    break;
                case "4":
                    piggyBank.addDime();
                    System.out.println("Added a dime.");
                    break;
                case "5":
                    piggyBank.addQuarter();
                    System.out.println("Added a quarter.");
                    break;
                case "6":
                    piggyBank.takeMoneyOut();
                    break;
                case "Q":
                case "q":
                    running = false;
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
