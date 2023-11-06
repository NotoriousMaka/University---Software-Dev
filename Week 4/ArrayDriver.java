import java.util.Scanner;

/**
 * This is the driver class for both the ArrayProcessor.java and Menu.java classes.
 * It prints out the length of the array "ap".
 * And then it prints out the menu option, if it is between the boundaries set in the Menu.java class.
 * If it is not between the boundaries set in the Menu.java class, it throws and error.
 * @author Alexe Tataru
 */

public class ArrayDriver {

    /**
     * This is the driver class for both the ArrayProcessor.java and Menu.java classes.
     * It prints out the length of the array "ap".
     * And then it prints out the menu option, if it is between the boundaries set in the Menu.java class.
     * If it is not between the boundaries set in the Menu.java class, it throws and error.
     * @param args it contains the supplied command-line arguments as an array of Strings.
     * @throws InvalidOptionException this class uses this class to throw an exception.
     */
    public static void main(String[] args) throws InvalidOptionException {
        ArrayProcessor ap = new ArrayProcessor();
        int len = ap.getArrayLength(new String[]{"one", "two", "three"});

        System.out.println("Array length is: " + len);

        Menu menu = new Menu();
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.println("Choose the menu option:");
                int opt = Integer.parseInt(scanner.nextLine());
                menu.displayMenuOption(opt);
            } catch (InvalidOptionException e) {}
        } catch (NumberFormatException e) {}
    }
}
