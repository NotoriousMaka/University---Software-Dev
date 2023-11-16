import java.util.Collections;
import java.util.List;

/**
 * The NumberChecker class provides methods for checking properties of numbers.
 * The growth function is n + 4 because there are three operations taking place:
 *          - Initialisation of the max variable.
 *          - If statement comparing numbers[i] with max.
 *          - Assignment inside the loop.
 *          - Returning the result.
 * The time complexity is O(n).
 * @author Alexe Tataru
 */
public class NumberChecker {

    /**
     * Finds the maximum value in an array of integers.
     *
     * @param numbers an array of integers
     * @return the maximum value in the array
     */
    int findMax(Integer[] numbers) {
        // Initializing max with the first element of the array
        int max = numbers[0]; // 1 operation

        // Loop through the array to find the maximum value
        for (int i = 1; i < numbers.length; i++) { // n operations (where n is the size of the array)
            // Compare each element with the current max and update if necessary
            if (numbers[i] > max) { // 1 operation
                max = numbers[i]; // 1 operation
            }
        }

        // Return the maximum value found
        return max;
    }
}
