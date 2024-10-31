package Skillbuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFile {

    public static void main(String[] args) {
        MyFile myFileApp = new MyFile();
        myFileApp.checkFileExists();
        myFileApp.createAndManageFile();
    }

    public void checkFileExists() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the file to check if it exists: ");
        String filename = scanner.nextLine();
        File file = new File(filename);

        if (file.exists()) {
            System.out.println("The file '" + filename + "' exists.");
        } else {
            System.out.println("The file '" + filename + "' does not exist.");
        }
    }

    public void createAndManageFile() {
        String filename = "zz2.txt";
        File file = new File(filename);

        try {
            if (file.createNewFile()) {
                FileWriter writer = new FileWriter(file);
                writer.write("This is a test file.");
                writer.close();
                System.out.println("The file '" + filename + "' has been created.");
            } else {
                System.out.println("The file '" + filename + "' already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to keep the file? (yes/no): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("no")) {
            if (file.delete()) {
                System.out.println("The file '" + filename + "' has been successfully deleted.");
            } else {
                System.out.println("An error occurred while deleting the file.");
            }
        } else {
            System.out.println("The file '" + filename + "' has been kept.");
        }
    }
}
