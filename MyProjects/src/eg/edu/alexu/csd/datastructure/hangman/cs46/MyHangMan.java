package eg.edu.alexu.csd.datastructure.hangman.cs46;

import java.util.Random;
import eg.edu.alexu.csd.datastructure.hangman.IHangman;

/**
 * @author wasfy this is test
 *
 */
public class MyHangMan implements IHangman {

    /**
     * @author wasfy this is test
     *
     */
    public String[] words = new String[100];
    /**
     * @author wasfy this is test
     *
     */
    int index;

    /**
     * @author wasfy this is test
     *
     */
    int count;

    /**
     * @author wasfy this is test
     *
     */
    int maxMistakes;

    /**
     * @author wasfy this is test
     *
     */
    String word;

    /**
     * @author wasfy this is test
     *
     */
    int countWords;

    /**
     * @author wasfy this is test
     *
     */
    boolean createdWord = false;

    /**
     * @author wasfy this is test
     *
     */
    public MyHangMan() {
        super();
    }

    @Override

    /**
     * @author wasfy this is test
     * @param words
     *            test
     */
    public void setDictionary(final String[] words) {
        try {
            countWords = words.length;
            this.words = words;
        } catch (Exception e) {
        }

    }

    @Override
    public String selectRandomSecretWord() {
        try {
            Random random = new Random();
            index = random.nextInt(countWords);
            return words[index];
        }
        // TODO Auto-generated method stub

        catch (AssertionError | Exception e) {
        }
        return words[index];
    }

    @Override
    public String guess(final Character c) {
        boolean flag = false;
        if (!createdWord && words[index].length() > 0) {
            char[] chars = new char[words[index].length()];
            for (int i = 0; i < words[index].length(); i++) {
                if (words[index].charAt(i) != ' ') {
                    chars[i] = '-';
                } else {
                    chars[i] = ' ';
                }
            }
            word = new String(chars);
            createdWord = true;
        }
        if (c != null) {
            for (int i = 0; i < words[index].length(); i++) {

                if ((Character.toLowerCase(c.charValue()) == words[index]
                        .charAt(i)
                        || Character.toUpperCase(c.charValue()) == words[index]
                                .charAt(i))) {
                    word = changeCharInPosition(i, words[index].charAt(i),
                            word);
                    flag = true;
                }
            }
        } else {
            flag = true;
        }
        if (flag == false) {
            count++;
        }
        if (count >= maxMistakes) {
            return null;
        } else {
            return word;
        }

    }

    /**
     * @author wasfy this is test
     * @param max
     *            test
     */
    @Override
    public void setMaxWrongGuesses(final Integer max) {
        // TODO Auto-generated method stub
        try {
            if (max.equals(null)) {
                maxMistakes = 0;
            }
            maxMistakes = max.intValue();
        } catch (AssertionError | Exception e) {

        }
    }

    /**
     * @author wasfy this is test
     * @param position
     *            test
     * @param ch
     *            test
     * @param str
     *            test
     * @return test
     */
    public String changeCharInPosition(final int position, final char ch,
            final String str) {
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }
}
