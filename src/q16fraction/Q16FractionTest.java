package q16fraction;

//File: Q16FractionTest.java
public class Q16FractionTest {
	/**
	* Fractions are represented by Java class Q16Fraction. We define the class, 
	* which in addition to the constructor and the accessor methods getNumerator 
	* and getDenominator have methods toString (to print a rational number) 
	* as well as getSum and getProduct, which generate the sum and the 
	* product of fractions and return the corresponding object of Class Q16Fraction.
	* This program is made to verify if it prints the correct string representation, 
	* sum, and product of the fractions according to the commands that we input. 
	* It is tested with: 
	* Q16Fraction f1 = new Q16Fraction(1, 2)
	* Q16Fraction f2 = new Q16Fraction(3, 7)
	* f1.toString(); which returns the string "1/2"
	* System.out.print(f2.getProduct(f1)); that should output 3/14 which is the 
	* product of f2 and f1
	* System.out.print(f2.getSum(f1)); that should output 13/14 which is the sum 
	* of f2 and f1
	*/
 public static void main(String[] args) {
	// Test your class: Q16Fraction in here
	 
	 // Make two instances of Q16Fraction with different numerator and denominator
     Q16Fraction f1 = new Q16Fraction(1, 2);
     Q16Fraction f2 = new Q16Fraction(3, 7);
     
     //Print string representation of f1
     System.out.println(f1.toString());
     
     // Print product of f2 and f1
     System.out.println(f2.getProduct(f1));
     
     // Print sum of f2 and f1
     System.out.println(f2.getSum(f1));
 }
}

