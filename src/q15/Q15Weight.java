package q15;

//File: Q15Weight.java
public class Q15Weight {
	/**
	* We are asked to make a program that can deal with weights given in pounds. 
	* The conversion rate that is provided is: 1 pound = 0.45359237 kilograms
	* First, we need to define a Q15Weight class, and write a constructor 
	* Q15Weight(double p) to generate a weight in pounds. Afterwards, 
	* the methods getPounds and getKilograms are implemented to return the weight 
	* in pounds and kilograms.
	*/
	  // Define your properties/fields here
	  private double pounds; // Denotes weight in pounds

	  // Define your constructor here
	  public Q15Weight(double p) {
	    pounds = p; // Set pounds value to the provided input
	  }

	  // Define your methods/functions in here
	  
	  // Get the weight in pounds
	  public double getPounds() {
	    return pounds;
	  }

	  // Convert weight from pounds to kilograms
	  public double getKilograms() {
	    return pounds * 0.45359237;
	  }
	}
