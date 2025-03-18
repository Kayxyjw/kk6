package javacore;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter your full name: ");
        String fullName = scanner.nextLine();

        
        String initials = getInitials(fullName);

     
        System.out.println("Your initials are: " + initials);

        scanner.close();
    }

    public static String getInitials(String fullName) {
        
        String[] nameParts = fullName.split("//s+");
        
    
        StringBuilder initials = new StringBuilder();
        for (String part : nameParts) {
            initials.append(part.charAt(0));
        }
        
        return initials.toString().toUpperCase();
    }
}