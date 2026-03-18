// PalindromeChecker class encapsulates all palindrome logic
class PalindromeChecker {

    // Method to check if a string is a palindrome
    public boolean checkPalindrome(String str) {
        // Normalize string (optional: lowercase & trim)
        String normalized = str.replaceAll("\\s+", "").toLowerCase();

        // Two-pointer approach
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker();

        // Input string
        String input = "Level";

        // Check palindrome
        if (checker.checkPalindrome(input)) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}
