package eg.edu.alexu.csd.datastructure.hangman.cs46;

import java.util.Arrays;
import java.util.Random;
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
	boolean createdWord  = false;
	
	

	public MyHangMan() {
		super();
		this.index = 0;
	}

	@Override
	public void setDictionary(String[] words) {
		for (i = 0; i < words.length; i++) {
			this.words[i] = words[i].trim();
			countWords++;
		}
		/*
		 * int i=0; try { File x =new File("dictionary.txt"); Scanner sc = new
		 * Scanner(x); while (sc.hasNext()) { words[i]=sc.next(); i++; }
		 * sc.close(); } catch(FileNotFoundException e) {
		 * System.out.println("error"); }
		 */
	}

	@Override
	public String selectRandomSecretWord() {

		Random random = new Random();
		index = random.nextInt(countWords);
		word = words[index];
		// TODO Auto-generated method stub
		return word;
	}

	@Override
	public String guess(Character c) {
		boolean flag = false;
		if (!createdWord)
		{
			char[] chars = new char[words[index].length()];
			Arrays.fill(chars,'-');
			word  = new String(chars);
			createdWord=true;
			}
		if (c != null) {
			for (i = 0; i < words[index].length(); i++) {

				if ((Character.toLowerCase(c) == words[index].charAt(i)||Character.toUpperCase(c) == words[index].charAt(i)) && word.charAt(i) == '-') {
					
					word =  changeCharInPosition(i,words[index].charAt(i),word);
					flag=true;
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
			return word;
		}

	}

	@Override
	public void setMaxWrongGuesses(Integer max) {
		// TODO Auto-generated method stub

		if (max == null) {
			maxMistakes = 0;
		}
		maxMistakes = max;

	}


public String changeCharInPosition(int position, char ch, String str){
    char[] charArray = str.toCharArray();
    charArray[position] = ch;
    return new String(charArray);
}
}
