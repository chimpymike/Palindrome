import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
	// Get the string to test
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Enter a string to test and see if it is a palindrome: ");
	String testString = keyboard.nextLine();

	// Test the string to see if it is a palindrome
	if (isPalindrome(testString)) {
	    System.out.println("This IS a palindrome.");
	} else {
	    System.out.println("This is NOT a palindrome.");
	}
    }

    /**
     * Tests if a string is a palindrome.
     *
     * @param s the string to be tested
     * @return true if the string is a palindrome, false if it is not a palindrome
     */
    public static boolean isPalindrome(String s) {
	if (s.length() <=1) {
	    return true;
	} else {
	    // Get the first and last characters from the string
	    Character firstChar, lastChar;
	    firstChar = Character.toLowerCase(s.charAt(0));
	    lastChar = Character.toLowerCase(s.charAt(s.length()-1));

	    if (!Character.isLetter(firstChar)) {
		if (!Character.isLetter(lastChar)) {
		    // first and last are both not letters so ignore them
		    return isPalindrome(s.substring(1, s.length()-1));
		} else {
		    // first is not a letter so ignore
		    return isPalindrome(s.substring(1, s.length()));
		}
	    } else if (!Character.isLetter(lastChar)) {
		// last is not a letter so ignore
		return isPalindrome(s.substring(0, s.length()-1));
	    } else if (firstChar.equals(lastChar)) {
		// first and last are equal so this is still a palindrome
		// call again without first and last
		return isPalindrome(s.substring(1, s.length()-1));
	    } else {
		// first and last are not equal so this is not a palindrome
		return false;
	    }
	}
    }
}

