import java.util.Scanner;

public class charactertype {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); 

      
        String result = determineCharacterType(ch);
        System.out.println(result);

        
       
    }

  
    public static String determineCharacterType(char ch) {
        
        if (ch >= 'A' && ch <= 'Z') {
            return "The character is a capital letter.";
        } else if (ch >= 'a' && ch <= 'z') {
            return "The character is a small case letter.";
        } else if (ch >= '0' && ch <= '9') {
            return "The character is a digit.";
        } else   {
            return "The character is a special symbol.";
        } 
    }
}
   