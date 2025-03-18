import java.util.Scanner;

public class Character {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        
        
        if (inputChar >= 'A' && inputChar <= 'Z') {
            System.out.println("The character is a capital letter.");
        } else if (inputChar >= 'a' && inputChar <= 'z') {
            System.out.println("The character is a small case letter.");
        } else if (inputChar >= '0' && inputChar <= '9') {
            System.out.println("The character is a digit.");
        } else {
            System.out.println("The character is a special symbol.");
        }
        
        
    }
                       
}