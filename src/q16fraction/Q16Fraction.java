package q16fraction;

//File: Q16Fraction.java
public class Q16Fraction {
	/**
	* Fractions are represented by Java class Q16Fraction. We define the class, 
	* which in addition to the constructor and the accessor methods getNumerator 
	* and getDenominator have methods toString (to print a rational number) 
	* as well as getSum and getProduct, which generate the sum and the 
	* product of fractions and return the corresponding object of Class Q16Fraction. 
	*/
    // Define your properties/fields here
    private int numerator; // Denotes fraction numerator
    private int denominator; // Denotes fraction denominator

    // Define your constructor here
    public Q16Fraction(int numerator, int denominator) {
        this.numerator = numerator; // Initialize numerator with provided input
        this.denominator = denominator; // Initialize denominator with provided input
    }

    // Define your methods/functions in here

    // Obtain fraction numerator
    public int getNumerator() {
        return numerator;
    }

    // Obtain fraction denominator
    public int getDenominator() {
        return denominator;
    }

    // Convert fraction to string representation
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Obtain fractions sum
    public Q16Fraction getSum(Q16Fraction other) {
        int sumNumerator = (numerator * other.denominator) + (other.numerator * denominator);
        int sumDenominator = denominator * other.denominator;
        return new Q16Fraction(sumNumerator, sumDenominator);
    }

    // Obtain fractions product
    public Q16Fraction getProduct(Q16Fraction other) {
        int productNumerator = numerator * other.numerator;
        int productDenominator = denominator * other.denominator;
        return new Q16Fraction(productNumerator, productDenominator);
    }
}
