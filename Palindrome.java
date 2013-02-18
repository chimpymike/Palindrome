class Palindrome {
    public static void main(String[] args) {
	String testPalindrome = "tenet";
	if (isPalindrome(testPalindrome)) {
	    System.out.println("This IS a palindrome.");
	} else {
	    System.out.println("This is NOT a palindrome.");
	}
    }

    public static boolean isPalindome(String s) {
	System.out.println("Testing for palindrome ...");

	if (s.length() <=1) {
	    return true;
	} else {
	    // Get the first and last characters from the string
	    Character firstChar, lastChar;
	    firstChar = Character.toLowerCase(s.charAt(0));
	    lastChar = Character.toLowerCase(s.charAt(s.length()-1));
	    System.out.print(firstChar);
	    System.out.println(lastchar);
	    
