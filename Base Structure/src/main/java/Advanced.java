import java.util.Locale;
import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content
     * <p>
     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord
     */
    public String wordCensor(String sentence, String word, String newWord) {
        String[] a = sentence.split(" ");
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(word)) {
                a[i] = newWord;
                break;
            }
        }
        String newSentence = "";
        for (int i = 0; i < a.length; i++) {
            newSentence = newSentence + a[i];
            if (i == a.length - 1) {
                break;
            }
            newSentence = newSentence + " ";
        }
        return newSentence;
    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     *
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName  is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName) {
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        String[] f = firstName.split("");
        String[] l = lastName.split("");
        f[0] = f[0].toUpperCase();
        l[0] = l[0].toUpperCase();
        String fullname = "";
        for (int i = 0; i < firstName.length(); i++) {
            fullname = fullname + f[i];
        }
        fullname = fullname + " ";
        for (int i = 0; i < lastName.length(); i++) {
            fullname = fullname + l[i];
        }
        fullname = fullname.trim();
        return fullname;    }

    /**
     * Removing repeated letter in a word
     *
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {

        String[] a = word.split("");
        for(int i = 1 ; i<word.length(); i++)
        {
            if(a[i].equals(a[i-1]))
            {
                a[i-1] = "";
            }
        }
        String word2 = "";
        for(int i = 0; i<word.length(); i++)
        {
            word2 = word2 + a[i];
        }
        return word2;
    }
}

