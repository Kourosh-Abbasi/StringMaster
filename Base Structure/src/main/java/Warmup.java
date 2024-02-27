public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     *
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String[] word = sentence.split(" ");
        if (number > word.length) {
            return (" Number = " + number + " is out Of Bound");
        } else {
            return word[number - 1];
        }
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     *
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        String[] n = number.split("");
        int[] n2 = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            n2[i] = Integer.parseInt(n[i]);
        }
        int k1 = 0, k2 = 0;
        for (int i = 0; i < n2.length; i++) {
            if (n2[i] % 2 == 0) {
                k2++;
            } else {
                k1++;
            }
        }
        if (searchForEven) {
            return k2;
        } else {
            return k1;
        }
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        char[] a = wordA.toCharArray();
        char[] b = wordB.toCharArray();
        int[] ia = new int[a.length];
        int[] ib = new int[b.length];
        for (int i = 0; i < a.length; i++) {
            ia[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            ib[i] = b[i];
        }
        for(int i = 0 ; i<a.length&&i<b.length; i++)
        {
            if(ia[i]<ib[i])
            {
                return wordA;
            }
            if(ia[i]>ib[i])
            {
                return wordB;
            }
        }
        return "-1";
    }


}