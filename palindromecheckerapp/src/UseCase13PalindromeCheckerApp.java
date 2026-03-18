import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase13PalindromeCheckerApp {

    // String Reverse Method
    public static boolean isPalindromeReverse(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }

    // Stack Method
    public static boolean isPalindromeStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) stack.push(ch);
        for (char ch : str.toCharArray()) if (ch != stack.pop()) return false;
        return true;
    }

    // Deque Method
    public static boolean isPalindromeDeque(String str) {
        Deque<Character> deque = new LinkedList<>();
        for (char ch : str.toCharArray()) deque.addLast(ch);
        while (deque.size() > 1) if (!deque.removeFirst().equals(deque.removeLast())) return false;
        return true;
    }

    public static void main(String[] args) {
        String input = "Able was I ere I saw Elba"; // Normalized
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Measure String Reverse
        long start = System.nanoTime();
        isPalindromeReverse(normalized);
        long end = System.nanoTime();
        System.out.println("String Reverse: " + (end - start) + " ns");

        // Measure Stack
        start = System.nanoTime();
        isPalindromeStack(normalized);
        end = System.nanoTime();
        System.out.println("Stack: " + (end - start) + " ns");

        // Measure Deque
        start = System.nanoTime();
        isPalindromeDeque(normalized);
        end = System.nanoTime();
        System.out.println("Deque: " + (end - start) + " ns");
    }
}