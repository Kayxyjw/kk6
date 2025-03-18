package homework;

import java.util.Scanner;

public class Reversestring {
    public static void printReverse(String input) {
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String userInput = scanner.nextLine();
        printReverse(userInput); 
    }
}