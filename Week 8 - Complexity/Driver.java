/**
 * The Driver class serves as the entry point for the program and demonstrates the usage of the NumberChecker class.
 * @author Alexe Tataru
 */
public class Driver {

    /**
     * The main method creates an instance of the NumberChecker class, calls the findMax method, and prints the result.
     *
     * @param args the command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Create an instance of NumberChecker
        NumberChecker numChecker = new NumberChecker();

        // Test the findMax method with an array of integers
        int max = numChecker.findMax(new Integer[]{5, 2, 7, 9, 10, 1, 2});

        // Print the result
        System.out.println("Max number is: " + max);

        // Create an instance of NumberGrid
        NumberGrid grid = new NumberGrid();
        System.out.println("\n");

        // Tests a grid with 5 numbers.
        System.out.println("Grid with 5 numbers.");
        grid.output(5);
        System.out.println("\n");

        // Tests a grid with 2 numbers.
        System.out.println("Grid with 2 numbers.");
        grid.output(2);
    }
}
