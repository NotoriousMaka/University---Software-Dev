import java.util.HashSet;
import java.util.Set;

/**
 * A class for managing a set of email addresses.
 * Uses a HashSet to store unique email addresses.
 *
 * @author Alexe Tataru
 */
public class EmailStore {

    /**
     * It creates a HashSet that includes the email addresses.
     */
    Set<String> emailAddresses = new HashSet<String>();

    /**
     * Adds an email address to the set if it doesn't already exist.
     *
     * @param email The email address to be added.
     */
    public void addEmail(String email) {
        if (emailAddresses.contains(email)) {
            System.out.println("The email " + email + " is already in the hash set.");
        } else {
            emailAddresses.add(email);
            System.out.println("The email " + email + " has been added to the hash set.");
        }
    }

    /**
     * Checks if the set contains a given email address.
     *
     * @param email The email address to check for.
     */
    public void hasEmail(String email) {
        System.out.println("Check if the email is in the hash set: ");
        if (emailAddresses.contains(email)) {
            System.out.println("The email " + email + " is inside the hash set.");
        } else {
            System.out.println("The email " + email + " is NOT inside the hash set.");
        }
    }

    /**
     * Displays the list of stored email addresses in the set.
     */
    public void showEmails() {
        System.out.println("List of emails: ");
        for (String email : emailAddresses) {
            System.out.println(email);
        }
    }
}
