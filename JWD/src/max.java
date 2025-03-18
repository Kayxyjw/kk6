public class max{

	
	    public static void main(String[] args) {
	        int value1 = 10, value2 = 20, value3 = 15;
	        
	        // Using ternary operator to find the maximum value
	        int max = (value1 > value2) ? 
	                    ((value1 > value3) ? value1 : value3) : 
	                    ((value2 > value3) ? value2 : value3);

	        // Output the maximum value
	        System.out.println("Maximum value is: " + max);
	    }
	}
	


