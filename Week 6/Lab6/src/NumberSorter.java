import java.util.Stack;

/**
 * The NumberSorter class provides a method to sort an array of integers in ascending or descending order
 * using two stacks and a specified order flag.
 *
 * @author Alexe Tataru
 */
public class NumberSorter {
    /**
     * Sorts an array of integers in the specified order (ascending or descending) using two stacks.
     *
     * @param numbers   An array of integers to be sorted.
     * @param ascending A boolean flag indicating whether to sort in ascending order (true) or descending order (false).
     */
    void sort(int[] numbers, boolean ascending) {
        // The source stack, from which the numbers are popped
        Stack<Integer> srcStack = new Stack<Integer>();
        // The dest stack, to which the numbers are pushed
        Stack<Integer> destStack = new Stack<Integer>();

        // Add the initial array of numbers to the source stack.
        for (int number : numbers) {
            srcStack.push(number);
        }

        while (!srcStack.isEmpty()) {
            int currentNumber = srcStack.pop();

            // Determine whether to push or pop based on the ascending flag.
            // return_value = (true-false condition) ? (if true expression) : (if false expression); (ternary expression)

            while (!destStack.isEmpty() && (ascending
                    ? currentNumber < destStack.peek()
                    : currentNumber > destStack.peek())) {

                srcStack.push(destStack.pop());
            }
            destStack.push(currentNumber);
        }

        // Copy the sorted numbers back to the source stack
        while (!destStack.isEmpty()) {
            srcStack.push(destStack.pop());
        }

        // Print the sorted numbers
        while (!srcStack.isEmpty()) {
            System.out.print(srcStack.pop() + " ");
        }
    }
}
