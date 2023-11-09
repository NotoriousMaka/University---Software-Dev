import java.util.Scanner;

/**
 * A driver class to test the functionality of EmailStore and WordCounter.
 *
 * @author Alexe Tataru
 */
public class EmailDriver {

    /**
     * The main method to run the email and word counting tests.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        EmailStore emailStore = new EmailStore();

        Scanner scan = new Scanner(System.in);

        String email = scan.nextLine();

        // Adding email addresses to the EmailStore
        emailStore.addEmail("alexetataru@yahoo.com");
        emailStore.addEmail("tatarualexe21@yahoo.com");
        emailStore.addEmail("computerscie@yahoo.com");
        emailStore.addEmail("georgeblack@yahoo.com");
        emailStore.addEmail("computerscie@yahoo.com");
        emailStore.addEmail("chrisbun@yahoo.com");
        System.out.println("\n");

        // Checking if specific emails exist in the EmailStore
        emailStore.hasEmail("alexetataru@yahoo.com");
        emailStore.hasEmail("chrisbun@yahoo.com");
        emailStore.hasEmail("lukebailey@yahoo.com");
        System.out.println("\n");

        // Displaying the list of stored email addresses in the EmailStore
        emailStore.showEmails();
        System.out.println("\n");

        // Testing WordCounter functionality
        WordCounter wc = new WordCounter();

        // Adding a sentence to the WordCounter and displaying word occurrences
        wc.addSentence("This sentence has the word it in it twice");
        wc.outputResults();
    }
}
