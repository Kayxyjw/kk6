import java.util.Scanner;

public class EnumEg3 {

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of the week ):");
        String input = scanner.next();

        Day day = null;
        for (Day d : Day.values()) {
            if (d.name().equals(input)) {
                day = d;
                break;
            }
        }

        if (day == null) {
            System.out.println("Please enter a capital letter");
        } else {
            switch (day) {
                case SUNDAY:
                    System.out.println("Sunday is best");
                    break;
                case SATURDAY:
                    System.out.println("Saturday is best");
                    break;
                case MONDAY:
                    System.out.println("Monday is bad");
                    break;
                
                default:
                    System.out.println(day + " is not bad");
            }
        }

          }
}