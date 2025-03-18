package homework;

import java.util.Scanner;

public class scramble{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to scramble:");
        String input = scanner.nextLine();

        
        String scrambledString = scrambleString(input);
        System.out.println("Scrambled string: " + scrambledString);
    }

    public static String scrambleString(String input) {
        StringBuilder scrambled = new StringBuilder();
        String[] words = input.split(" ");
        
        for (String word : words) {
            if (word.length() <= 3) {
                scrambled.append(word);
            } else {
scrambled.append(scrambleWord(word));a
            }
            scrambled.append(" ");
        }

        return scrambled.toString().trim();
    }

    public static String scrambleWord(String word) {
        if (word.length() <= 3) {
            return word;
        }
        
        char[] chars = word.toCharArray();
        for (int i = 1; i < chars.length - 2; i++) {
            int j = i + (int)(Math.random() * (chars.length - 2 - i));
            
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        return new String(chars);
    }
}