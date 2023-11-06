import java.util.Objects;
import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args)
    {
        Scanner sentence = new Scanner(System.in); //sentence input
        System.out.println("Enter a sentence: "); //prints out the output to the screen

        String sent = sentence.nextLine(); //saves the input into "sent"

        WordProcessor wordprocess = new WordProcessor(); //creates a new object from the WordProcessor class

        System.out.println("There are " + wordprocess.countLetters(sent) + " letters."); //prints the number of letters
        System.out.println("There are " + (wordprocess.countWords(sent) - 1) + " words."); //prints the number of words
        System.out.println("The length of the string is: " + wordprocess.getLength(sent) + " characters."); //prints the length of the sentence
    }
}
