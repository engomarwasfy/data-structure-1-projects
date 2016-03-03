package eg.edu.alexu.csd.datastructure.hangman.cs46;

import java.util.Random;
import eg.edu.alexu.csd.datastructure.hangman.IHangman;

public class MyHangMan implements IHangman {
	public String[] words = new String[100];
	static int index;
	static int count;
	static int maxMistakes;
	static String word;
	static int countWords;
	boolean createdWord = false;

	public MyHangMan() {
		super();
	}

	@Override
	public void setDictionary(String[] words) {
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
	public String guess(Character c) {
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

					if ((Character.toLowerCase(c.charValue()) == words[index].charAt(i)
							|| Character.toUpperCase(c.charValue()) == words[index].charAt(i))
							     ) {
						word = changeCharInPosition(i, words[index].charAt(i), word);
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

	@Override
	public void setMaxWrongGuesses(Integer max) {
		// TODO Auto-generated method stub
		try {
			if (max.equals(null)) {
				maxMistakes = 0;
			}
			maxMistakes = max.intValue();
		} catch (AssertionError | Exception e) {

		}
	}

	public String changeCharInPosition(int position, char ch, String str) {
		char[] charArray = str.toCharArray();
		charArray[position] = ch;
		return new String(charArray);
	}
}