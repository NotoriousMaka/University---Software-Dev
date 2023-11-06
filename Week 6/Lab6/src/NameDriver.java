/**
 * The NameDriver class serves as the entry point for testing the NameManager class.
 *
 * @author Alexe Tataru
 */
public class NameDriver {
    /**
     * The main method creates an instance of the NameManager class, adds names to the list,
     * and tests the addition and removal of long names.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        NameManager manager = new NameManager();

        // Add names to the NameManager
        manager.addName("M.Mickleson");
        manager.addName("Johnua Taylor Biggs");
        manager.addName("P.Smith");
        manager.addName("Peter Jonathan Smythton");
        manager.addName("P.Thompson");

        // Print all names in the list
        System.out.println("All names in the list.");
        manager.printNames();
        System.out.println("\n");

        // Remove long names and print the updated list
        System.out.println("List after long names have been removed.");
        manager.removeLongNames();
        manager.printNames();
    }
}
