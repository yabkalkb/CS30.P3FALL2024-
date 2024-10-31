package Skillbuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        Assignment assignmentApp = new Assignment();
        assignmentApp.displayInstructions();
    }

    public void displayInstructions() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path of the instructions file: ");
        String path = scanner.nextLine().trim();

        if (path.isEmpty()) {
            path = "instructions.txt"; // Default to "instructions.txt" in the current directory
        }

        File file = new File(path);

        try (Scanner fileScanner = new Scanner(file)) {
            System.out.println("\n=== Assignment Instructions ===");
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file could not be found at the specified path.");
        }
    }
}

