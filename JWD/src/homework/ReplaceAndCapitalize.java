package homework;
import java.util.Scanner;

public class ReplaceAndCapitalize {
    public static String transformText(String text) {
        
        return text.replace('a', '@')
                  .replace('A', '@')
                  .toUpperCase();
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
 
        System.out.print("Enter your text: ");
        String input = scanner.nextLine();
        
        
        String transformed = transformText(input);
        System.out.println("Transformed text: " + transformed);
        
        scanner.close();
    }
}