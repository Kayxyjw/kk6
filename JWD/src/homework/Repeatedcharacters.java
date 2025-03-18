package homework;

import java.util.*;
public class Repeatedcharacters {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    int c=0;
    System.out.print("Enter a word: ");
    String input=scan.next();
    System.out.print("Enter the character you'd like to count: ");
    
    char cha=scan.next().charAt(0);
    
    for(int i=0; i<input.length();i++) {
      if (input.charAt(i) == cha) {
        c++;
      }
    }
    System.out.println("The character "+cha+" appears "+c+" time(s).");
  }    
}
