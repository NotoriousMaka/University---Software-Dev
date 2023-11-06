/**
 * It is the class that checks if the option given is between the boundaries given.
 * If the option is not, it throws an exception InvalidOptionException.java.
 * @author Alexe Tataru
 */

public class Menu {
    /**
     * It is the class that checks if the option given is between the boundaries given.
     * If the option is not, it throws an exception InvalidOptionException.java.
     * @param opt it is the option that is written by the user.
     * @throws InvalidOptionException
     */
    void displayMenuOption(int opt) throws InvalidOptionException {
        if (opt > 3 || opt < 1) {
            
            throw new InvalidOptionException();
        }
        else {
            System.out.println("Menu option: " + opt + " selected.");
        }
    }
}

