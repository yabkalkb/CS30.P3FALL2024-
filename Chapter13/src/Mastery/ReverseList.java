package Mastery;

import java.util.Scanner;  // Import Scanner class for input
import java.util.Stack;    // Import Stack class to store integers

public class ReverseList {

    public static void main(String[] args) {
        // Create a Stack to store the integers entered by the user
        Stack<Integer> stack = new Stack<>();
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Initialize a counter to limit the number of inputs
        int count = 0;

        // Start a loop to allow the user to input up to 10 numbers
        while (count < 10) {
            // Prompt the user to enter a number
            System.out.print("Enter a number (999 to quit): ");
            
            // Read the user's input as an integer
            int number = scanner.nextInt();

            // Check if the user entered 999, in which case we stop the loop
            if (number == 999) {
                break; // Exit the loop if the user wants to quit
            }

            // Push the entered number onto the stack
            stack.push(number);

            // Increment the counter after each valid input
            count++;
        }

        // Print a message to indicate that the list will be shown in reverse order
        System.out.print("The list reversed is: ");

        // While there are elements in the stack, pop and display them
        while (!stack.isEmpty()) {
            // Pop the top element from the stack and print it
            System.out.print(stack.pop() + " ");
        }

        // Print a newline after displaying all reversed numbers
        System.out.println();

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
