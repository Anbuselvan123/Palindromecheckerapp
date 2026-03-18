public class UseCase10PalindromeCheckerApp {

    // Method to check palindrome ignoring spaces and case
    public static boolean isPalindrome(String str) {
        // Normalize string: remove spaces and convert to lowercase
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

    public static void main(String[] args) {

        // Input string
        String input = "A man a plan a canal Panama";

        // Check palindrome
        if (isPalindrome(input)) {
            System.out.println("The string \"" + input + "\" is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}
