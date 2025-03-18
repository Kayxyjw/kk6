package homework;
import java.util.Scanner;

public class InitialsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = scanner.nextLine();
        String initials = "";

         
        String[] nameParts = fullName.split(" ");

        
        for (String part : nameParts) {
            if (!part.isEmpty()) {
                initials += part.charAt(0);
            }
        }

        System.out.println("Initials: " + initials.toUpperCase());
    }
}