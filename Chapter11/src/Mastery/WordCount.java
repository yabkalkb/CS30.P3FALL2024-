package Mastery;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        String filename = "../Chapter11/src/Mastery/source.txt";
        
        try {
            File file = new File(filename);
            System.out.println(file.exists());
            
            Scanner scanner = new Scanner(file);
            
            int wordCount = 0;
            int totalLength = 0;

            while (scanner.hasNext()) {
                String word = scanner.next();
               
                word = word.replaceAll("^[^a-zA-Z]+|[^a-zA-Z]+$", "");

                if (!word.isEmpty()) {
                    wordCount++;
                    totalLength += word.length();
                }
            }

            scanner.close();

            double averageLength = wordCount > 0 ? (double) totalLength / wordCount : 0;

            System.out.println("Total words: " + wordCount);
            System.out.printf("Average word length: %.2f\n", averageLength);

        } catch (FileNotFoundException e) {
            System.out.println("The file '" + filename + "' does not exist.");
        }
    }
}

