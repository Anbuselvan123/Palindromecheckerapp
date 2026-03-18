public class UseCase9PalindromeCheckerApp {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base condition: single char or crossed pointers
        if (start >= end) return true;

        // Compare characters
        if (str.charAt(start) != str.charAt(end)) return false;

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        // Input string
        String input = "noon";

        // Call recursive palindrome checker
        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}