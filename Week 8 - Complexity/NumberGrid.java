/**
 * The NumberGrid class provides a method to output a grid of numbers based on the specified range.
 * @author Alexe Tataru
 */
public class NumberGrid {

    /**
     * Outputs a grid of numbers, with rows and columns determined by the given range value.
     *
     * @param range the specified range value determining the number of rows and columns
     */
    void output(int range) {
        // Loop for creating the rows.
        for (int i = 1; i <= range; i++) {
            // Loop for creating the columns.
            for (int j = 1; j <= range; j++) {
                // Prints the number and leaves a space for the other one.
                System.out.print(i + " ");
            }
            // Moves to the next line after completion of a row.
            System.out.println();
        }
    }
}
