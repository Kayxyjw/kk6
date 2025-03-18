
public class ForEach {

	
	public static void main(String[] args) {
	    String[] ary = {"A", "B", "C","D"};
	    int counter = 1; // Initialize a counter to start from 1

	    for (String s : ary) {
	    	if (counter==3)
	        System.out.println(counter + "." + s); // Print the counter and the string
	        counter++; // Increment the counter
	    }
			
	}

}
