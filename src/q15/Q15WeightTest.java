package q15;

//File: Q15WeightTest.java
public class Q15WeightTest {
	/**
	* We are asked to make a program that can deal with weights given in pounds. 
	* The conversion rate that is provided is: 1 pound = 0.45359237 kilograms
	* First, we need to define a Q15Weight class, and write a constructor 
	* Q15Weight(double p) to generate a weight in pounds. Afterwards, 
	* the methods getPounds and getKilograms are implemented to return the weight 
	* in pounds and kilograms.
	* This program is made to verify if the weight in pounds is converted correctly
	* into kilograms with the correct value. It is tested with 10 pounds as 
	* the weight that needs to be converted into kilograms.
	*/
	  public static void main(String[] args) {
		// Test your class: Q15Weight in here
		
		// Make new instance of Q15Weight with provided input  
	    Q15Weight weight = new Q15Weight(10.0);
	    
	    // Print weight in pounds
	    System.out.println("Weight in pounds: " + weight.getPounds());
	    
	    // Print weight in kilograms
	    System.out.println("Weight in kilograms: " + weight.getKilograms());
	  }
	}
