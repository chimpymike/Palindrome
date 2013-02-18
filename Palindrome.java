import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
	String testPalindrome = "tenet";
	if (isPalindrome(testPalindrome)) {
	    System.out.println("This IS a palindrome.");
	} else {
	    System.out.println("This is NOT a palindrome.");
	}
    }

    public static boolean isPalindrome(String s) {
	System.out.println("Testing for palindrome ...");

	if (s.length() <=1) {
	    return true;
	} else {
	    // Get the first and last characters from the string
	    Character firstChar, lastChar;
	    firstChar = Character.toLowerCase(s.charAt(0));
	    lastChar = Character.toLowerCase(s.charAt(s.length()-1));
	    System.out.print(firstChar);
	    System.out.println(lastChar);

	    if (!Character.isLetter(firstChar)) {
		if (!Character.isLetter(lastChar)) {
		    // first and last are both not letters so ignore them
		    System.out.println("Both are not letters.");
		    return isPalindrome(s.substring(1, s.length()-1));
		} else {
		    // first is not a letter so ignore
		    System.out.println("firstChar is NOT a letter");
		    return isPalindrome(s.substring(1, s.length()));
		}
	    } else if (!Character.isLetter(lastChar)) {
		// last is not a letter so ignore
		System.out.println("lastChar is NOT a letter");
		return isPalindrome(s.substring(0, s.length()-1));
	    } else if (firstChar.equals(lastChar)) {
		// first and last are equal so this is still a palindrome
		// call again without first and last
		System.out.println("firstChar EQUALS lastChar.");
		return isPalindrome(s.substring(1, s.length()-1));
	    } else {
		// first and last are not equal so this is not a palindrome
		System.out.println("firstChar DOES NOT EQUAL lastChar.");
		return false;
	    }
	}
    }
}

