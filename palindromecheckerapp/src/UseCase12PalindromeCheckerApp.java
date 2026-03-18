// Palindrome strategy interface
interface PalindromeStrategy {
    boolean isPalindrome(String str);
}

// Stack-based implementation
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String str) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        String normalized = str.replaceAll("\\s+", "").toLowerCase();

        for (char ch : normalized.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : normalized.toCharArray()) {
            if (ch != stack.pop()) return false;
        }
        return true;
    }
}

// Deque-based implementation
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String str) {
        java.util.Deque<Character> deque = new java.util.LinkedList<>();
        String normalized = str.replaceAll("\\s+", "").toLowerCase();

        for (char ch : normalized.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) return false;
        }
        return true;
    }
}

// Context class to inject strategy
class PalindromeCheckerContext {
    private PalindromeStrategy strategy;

    public PalindromeCheckerContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String str) {
        return strategy.isPalindrome(str);
    }
}

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Able was I ere I saw Elba";

        // Use Stack strategy
        PalindromeCheckerContext stackChecker = new PalindromeCheckerContext(new StackStrategy());
        System.out.println("Stack Strategy: " + (stackChecker.check(input) ? "Palindrome" : "Not Palindrome"));

        // Use Deque strategy
        PalindromeCheckerContext dequeChecker = new PalindromeCheckerContext(new DequeStrategy());
        System.out.println("Deque Strategy: " + (dequeChecker.check(input) ? "Palindrome" : "Not Palindrome"));
    }
}