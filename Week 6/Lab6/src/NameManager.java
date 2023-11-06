import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The NameManager class manages a list of names and provides methods for adding,
 * printing, and removing long names from the list.
 *
 * @author Alexe Tataru
 */
public class NameManager {
    // List to store names
    private List<String> names = new ArrayList<String>();

    /**
     * Adds a name to the list of names.
     *
     * @param name The name to be added.
     */
    public void addName(String name) {
        names.add(name);
    }

    /**
     * Prints the list of names to the console.
     */
    public void printNames() {
        for (String name : names) {
            System.out.println(name);
        }
    }

    /**
     * Removes names from the list that have a length greater than 15 characters using an Iterator.
     */
    public void removeLongNames() {
        Iterator<String> it = names.iterator();

        while (it.hasNext())
        {
            String name = it.next();

            if(name.length() > 15)
            {
                it.remove();
            }
        }
        //names.removeIf(name -> name.length() > 15);
    }
}
