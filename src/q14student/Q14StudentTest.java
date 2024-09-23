package q14student;

//File: Q14StudentTest.java
public class Q14StudentTest {
	/**
	* First, we need to define class Q14Student as well as a constructor and 
	* getter methods. A Q14Student is represented by her/his name, 
	* her/his Student ID, and the Degree Programme, each of which is a String. 
	* We also need to write a method toString that returns a String in 
	* the following format:
	* "[Kinanti Wedariningsih, ID: 1000001, Bachelor Informatics]".
	* This program is made to test Q14Student and check if it produces the
	* correct output. It is tested with Kinanti Wedariningsih as the name, 
	* 1000001 as the student ID, and Bachelor Informatics as the degree and programme.
	*/
    public static void main(String[] args) {
    	// Test your class: Q14Student in here
    	
    	// Make new instance of Q14Student with provided input
        Q14Student student = new Q14Student("Kinanti Wedariningsih", "1000001", "Bachelor Informatics");
        
        // Print string representation
        System.out.println(student.toString());
    }
}
