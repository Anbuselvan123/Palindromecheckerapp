public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String input = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}