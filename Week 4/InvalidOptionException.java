/** 
 * This class only prints out the text in case there is an error in the Driver class,
 * when it looks for the boundaries set in the Menu.java class.
 * @author Alexe Tataru
 */

public class InvalidOptionException extends Exception {
    /** 
     * This class only prints out the text in case there is an error in the Driver class,
     * when it looks for the boundaries set in the Menu.java class.
    */
    public InvalidOptionException()
    {
        System.out.println("Error: Invalid option");
    }
}
