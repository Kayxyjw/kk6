package javacore;

public class ExceptionError {

    public static void main(String[] args) {

        testTryCatch();

        
            testThrows();
        

    }

    public static void testThrows() throws RuntimeException {

    }

    public static void testTryCatch() {

        try {
            int i = 25 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }
    }
}