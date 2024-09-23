package q14student;

//File: Q14Student.java
public class Q14Student {
	/**
	* First, we need to define class Q14Student as well as a constructor and 
	* getter methods. A Q14Student is represented by her/his name, 
	* her/his Student ID, and the Degree Programme, each of which is a String. 
	* We also need to write a method toString that returns a String in 
	* the following format:
	* "[Kinanti Wedariningsih, ID: 1000001, Bachelor Informatics]".
	* This program is tested with Kinanti Wedariningsih as the name, 1000001 as the
	* student ID, and Bachelor Informatics as the degree and programme.
	*/
	// Define your properties/fields here
    private String name; // Stores student name
    private String studentId; // Stores student id
    private String degreeProgramme; // Stores student degree and programme

    // Define your constructor here
    public Q14Student(String name, String studentId, String degreeProgramme) {
        this.name = name; // Initialize name variable with provided input
        this.studentId = studentId; // Initialize studentId variable with provided input
        this.degreeProgramme = degreeProgramme; // Initialize degreeProgramme variable with provided input
    }

    // Obtain student name
    public String getName() {
        return name;
    }

    // Obtain student ID 
    public String getStudentId() {
        return studentId;
    }

    //Obtain student degree and programme
    public String getDegreeProgramme() {
        return degreeProgramme;
    }

    // Define your method/function toString in here
    public String toString() {
        return "[" + name + ", ID: " + studentId + ", " + degreeProgramme + "]"; // Convert to string representation
    }
}
