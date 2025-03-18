package javacore;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterCounter {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java CharacterCounter <filename> <character>");
            return;
        }

        String filename = args[0];
        char searchChar = args[1].charAt(0);

        createFileWithContent(filename);
        countCharacterInFile(filename, searchChar);
    }

    public static void createFileWithContent(String filename) {
        try {
            File file = new File(filename);

          
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

       
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, World! This is a test file to count characters.\nExample content with some characters.\n");
            writer.close(); 
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }


    public static void countCharacterInFile(String filename, char searchChar) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int charCount = 0;
            int currentChar;

            while ((currentChar = reader.read()) != -1) {
                if (currentChar == searchChar) {
                    charCount++;
                }
            }

            System.out.println("Character '" + searchChar + "' appears " + charCount + " times in the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
        