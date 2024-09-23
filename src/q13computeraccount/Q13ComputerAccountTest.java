package q13computeraccount;

//File: Q13ComputerAccountTest.java
public class Q13ComputerAccountTest {
	/**
	* First, we need to define class Q13ComputerAccount and a constructor 
	* to create it. The computer account is built from three strings which are 
	* realName, userName, and password. It implements three methods which are
	* printRealName, printUserName, printPassword, and changePassword. The first 
	* three methods take no arguments. The last method takes one argument 
	* of type String, the new password, and sets the password to the new password; 
	* its return value is void.
	* This program is made to test the computer account and check if it produces the
	* correct output. It is tested with Heath Storm as the real name, heathstorm as 
	* the username, welcomedistrict as the password, and mikrokosmos as the 
	* new password.
	*/
    public static void main(String[] args) {
        // Test your class: Q13ComputerAccount in here
    	
    	// Make new instance of Q13ComputerAccount with provided input
        Q13ComputerAccount account = new Q13ComputerAccount("Heath Storm", "heathstorm", "welcomedistrict");
       
        // Print real name of computer account
        account.printRealName();
        
        //Print username of computer account
        account.printUserName();
        
        // Print password of computer account
        account.printPassword();
        
        // Change password of computer account to "mikrokosmos"
        account.changePassword("mikrokosmos");
    }
}
