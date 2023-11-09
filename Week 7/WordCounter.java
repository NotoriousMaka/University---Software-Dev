import java.util.HashMap;
import java.util.Map;

/**
 * A class for counting the occurrences of unique words in a sentence.
 * Uses a map to store words and their occurrence counts.
 *
 * @author Alexe Tataru
 */
public class WordCounter {

    /**
     * Maps words to their occurrence count.
     */
    private final Map<String, Integer> wordMap = new HashMap<>();

    /**
     * Adds a word to the wordMap, updating its occurrence count.
     *
     * @param word The word to be added.
     */
    public void addWord(String word) {

        wordMap.merge(word, 1, Integer::sum);

        Integer count = wordMap.get(word);
        //if (count == null) {
        //    wordMap.put(word, 1);
        //} else {
        //    wordMap.put(word, count + 1);
        //}
    }

    /**
     * Adds each word from a sentence to the wordMap.
     *
     * @param sentence The input sentence.
     */
    public void addSentence(String sentence) {
        String[] words = sentence.split(" ");

        for (String word : words) {
            addWord(word);
        }
    }

    /**
     * Displays each word in the wordMap along with its occurrence count.
     */
    public void outputResults() {
        System.out.println("Word occurrences: ");

        for (String word : wordMap.keySet()) {
            int count = wordMap.get(word);

            System.out.println(word + ": " + count);
        }
    }
}
