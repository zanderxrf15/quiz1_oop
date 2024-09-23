package jokes;

//File Jokes.java
public class Jokes {
	/** 
	 * We need to define the class Jokes. A variable of type string 
	 * namely joke_string stores the joke. Two methods are utilised in this class. 
	 * The first method is_funny(). It will determine if the joke is funny or not. 
	 * If the length of the joke is under 20 characters (including space) 
	 * the joke is funny, otherwise, the joke is not funny. It will output 
	 * “It’s funny” if the joke is funny and “It’s not funny” if the joke is 
	 * not funny. 
	 * The second method is first_word(). It will print the first word of the joke 
	 * separated by a blank space.
	 * This program is tested with two jokes and the program determines if the joke 
	 * is funny or not as well as printing the first word of the joke. 
	 */
    // String of joke
    private static String joke_string;

    // Function to determine if joke is funny or not
    // If length of joke is < 20, it's funny. Otherwise, it isn't funny
    public static void is_funny() {
        if (joke_string.length() < 20) { // Check if joke string length is less than 20
            System.out.println("It's funny"); // Print "It's funny" if the joke fulfils the term
        }
        else {
            System.out.println("It's not funny"); // Print "It's not funny" if the joke doesn't fulfil the term
        }
    }

    // Function to obtain the first word of the joke, separated by space
    public static void first_word() {
        String[] words = joke_string.split(" "); // Split joke string into an array of words
        System.out.println(words[0]); // Print first word of joke
    }

    // Function for testing the program
    public static void main(String[] args) {
        joke_string = "Knock knock who's there?"; // Set joke string to knock-knock joke
        is_funny(); // Check if joke is funny
        first_word(); // Obtain and output first word of joke

        joke_string = "Your life"; // Set joke string to another joke
        is_funny(); // Check if joke is funny
        first_word(); // Obtain and output first word of joke
    }
}
