package Mastery;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAndReplace {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String content;
        // Prompting user for inputs
        System.out.print("Enter the file name: ");
        String filename = scanner.nextLine();
        
        File File = new File("../Chapter11/src/Mastery/" + filename);
        
        if (!File.exists()) 
        {
        	System.out.println("File [" + filename + "] was not found.");
        	return;
        }
        
        try {
        	// Read all content from the file
        	content = new String(Files.readAllBytes(Paths.get("../Chapter11/src/Mastery/" + filename)));
        } catch (FileNotFoundException e) 
        {
        	System.out.println("Failed to get file.");
        	return;
        }

        System.out.print("Enter the word or phrase to search: ");
        String searchWord = scanner.nextLine();
        
        List<String> Words = new ArrayList<>();
        
        for (String Word : Files.readAllLines(Paths.get("../Chapter11/src/Mastery/" + filename))) 
        {
        	if (!Word.equals(" ")) 
        	{
        		Words.add(searchWord);
        	}
        }
        
        boolean hasWord = false;
        
        for (String Word : Words) 
        {
        	if (Word.equals(searchWord)) 
        	{
        		hasWord = true;
        		break;
        	}
        }
        
        if (!hasWord) 
        {
        	System.out.println(filename + " Doesn't contain any word that is [" + searchWord + "]");
        	return;
        }

        System.out.print("Enter the replacement word or phrase: ");
        String replacementWord = scanner.nextLine();

        // Attempt to find and replace content in the file
        try {
            // Read all content from the file

            // Replace all occurrences of the search word/phrase with the replacement word/phrase
            String updatedContent = content.replace(searchWord, replacementWord);

            PrintWriter writer = new PrintWriter("../Chapter11/src/Mastery/" + filename);
			writer.write(updatedContent);
			writer.close();

            System.out.println("Replacement completed successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("The file " + filename + " does not exist.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
