package javacore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Employee {
	


	    private int empId;
	    private String name;
	  @Override
	  public String toString() {
	    return "Employee [empId=" + empId + ", name=" + name + "]";
	  }
	    
	    
	    
	    }
	
