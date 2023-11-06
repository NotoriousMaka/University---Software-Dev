/**
 * The NumberDriver class serves as the entry point for testing the NumberSorter class.
 *
 * @author Alexe Tataru
 */
public class NumberDriver {
    /**
     * The main method creates an instance of the NumberSorter class and tests the sorting method
     * with different sets of integers in both ascending and descending order.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        NumberSorter sorter = new NumberSorter();

        // Test sorting in descending order
        sorter.sort(new int[]{1, 9, 2, 3, 10, 8, 12, 1, 99, 2, 43, 68, 109, 0}, false);
        System.out.println();

        // Test sorting in ascending order
        sorter.sort(new int[]{1, 2, 3, 4}, true);
        System.out.println();

        // Test sorting in descending order
        sorter.sort(new int[]{4, 3, 2, 1}, false);
        System.out.println();
    }
}
