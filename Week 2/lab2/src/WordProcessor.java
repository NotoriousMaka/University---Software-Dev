public class WordProcessor implements Main.Counter {
    static String text = "There is no text inserted."; //creates the text that prints out in case the sentence is null.

    public void setText(String text) { //setter for the text
        WordProcessor.text = text;
    }

    public static String getText() { //getter for the text
        return text;
    }

    @Override
    public int countWords(String sentence) {

        if (sentence == null) //checks if the sentence is null, and prints out text.
        {
            
        }
        else {
            int words = sentence.split("\\w+").length; //regex to find the words by splitting spaces
            return words;// returns words
        }
        return 0;
    }

    @Override
    public int countLetters(String sentence) {
        int letters = 0;

        if (sentence == null)
        {

        }
        else
        {
            for (int i = 0; i < sentence.length(); i++) { //goes through the lengths of the sentence
                if (Character.isLetter(sentence.charAt(i))) //looks if the character is a letter
                    letters++; //adds one to the letter
            }
            return letters; //returns letters
        }
        return 0;
    }

    @Override
    public int getLength(String sentence) {
        if (sentence == null)
        {

        }
        else
        {
            int length = sentence.length(); //gets the length of the sentence
            return length; //returns the length of the sentence
        }
        return 0;
    }
}
