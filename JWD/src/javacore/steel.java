package javacore;
import java.util.Scanner;
public class steel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		System.out.println("Hardness:");
		double Hardness=s.nextDouble();
		System.out.println("Carbon:");
		double Carbon=s.nextDouble();
		System.out.println("Tensile:");
		double Tensile=s.nextDouble();
		
		boolean Condition1= Hardness > 50;


		boolean Condition2= Carbon < 0.7;


		boolean Condition3= Tensile > 5600;
		
		if (Condition1 && Condition2 && Condition3)
			{System.out.println("Steel grade 10:");}
		else if (Condition1 && Condition2)
			{System.out.println("Steel grade 9");}
		else if (Condition2 && Condition3)
		{System.out.println("Steel grade 8");}
	
		else if (Condition1 && Condition3)
		{System.out.println("Steel grade7");}
		else if (Condition1 || Condition2 || Condition3)
		{System.out.println("Steel grade6");}
		else {System.out.println("Steel grade5");}

} }
