package eg.edu.alexu.csd.datastructure.hangman.cs46;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutionException;

import org.omg.CORBA.ExceptionList;

import eg.edu.alexu.csd.datastructure.hangman.IHangman;

public class MyHangMan implements IHangman {
	public String[] words = new String[100];
	static int i;
	char[] visited = new char[1000];
	static int counterOfCharacters;
	public int index;
	static int count;
	static int maxMistakes;
	static String word;
	static int countWords;
	boolean createdWord = false;

	public MyHangMan() {
		super();
		this.index = 0;
	}

	@Override
	public void setDictionary(String[] words) {
		try {
			for (i = 0; i < words.length; i++){
				if(!words[i].equals(null))
				{
				this.words[i] = words[i];
				countWords++;
				}
			}

		} catch (AssertionError|Exception e) {
		}
		
	}

	@Override
	public String selectRandomSecretWord() {
		try {
			Random random=new Random();
			index=random.nextInt(countWords-1);
			word = words[index];
			// TODO Auto-generated method stub
			if (!word.equals(null))
			{
			return word;
			}
		} catch (AssertionError|Exception e) {

		}
		return word;
	}

	@Override
	public String guess(Character c) {
		try {
			boolean flag = false;
			if (!createdWord&&words[index].length()>0) {
				char[] chars = new char[words[index].length()];
				Arrays.fill(chars, '-');
				word = new String(chars);
				createdWord = true;
			}
			if (!c.equals(null)) {
				for (i = 0; i < words[index].length(); i++) {

					if ((Character.toLowerCase(c.charValue()) == words[index].charAt(i)
							|| Character.toUpperCase(c.charValue()) == words[index].charAt(i)) && word.charAt(i) == '-') {
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
			if (count > maxMistakes) {
				return null;
			} else {
				return word ;
			}
		}
		

		catch (AssertionError|Exception e) {

		}
		return word;
		
	}

	@Override
	public void setMaxWrongGuesses(Integer max) {
		// TODO Auto-generated method stub
		try {
			if (max.equals(null)) {
				maxMistakes = 0;
			}
			maxMistakes = max.intValue();
		} catch (AssertionError|Exception e) {

		}
	}

	public String changeCharInPosition(int position, char ch, String str) {
		char[] charArray = str.toCharArray();
		charArray[position] = ch;
		return new String(charArray);
	}
}