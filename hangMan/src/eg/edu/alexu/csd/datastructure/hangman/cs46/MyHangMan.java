package eg.edu.alexu.csd.datastructure.hangman.cs46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import eg.edu.alexu.csd.datastructure.hangman.IHangman;

public class MyHangMan implements IHangman {
	public String[] words = new String[100];
	public int index;
	static int count;
	char[] validChar = new char[100];
	int validCharCounter;
	int maxMistakesInt;

	@Override
	public void setDictionary(String[] words){
		int i=0;
		try
		{
		File x =new File("dictionary.txt");
		Scanner sc = new Scanner(x);
		while (sc.hasNext())
		{
			words[i]=sc.next();
			i++;
		}
		sc.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("error");
		}
	}

	@Override
	public String selectRandomSecretWord() {

		Random random = new Random();
		index = random.nextInt(words.length);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String guess(Character c)
	{
		
	
		String word;
		 word=words[index];
		int flag=0;
		if (c!=null)
		{
			for(int i=0;i<=words[index].length();i++)
			{
			if(c==words[index].charAt(i))
			{
				flag=1;
				
			}
			else
				for(int j=0;j<validCharCounter;j++)
			{
					if(validChar[j] != words[index].charAt(i))
					{
				word.replace(words[index].charAt(i),'-') ;
					}
			}
			}
			if (flag==1)
			{
				validChar[validCharCounter]=c;
				validCharCounter++;
			}
			else
			{
				count++;
			}
			if(count > maxMistakesInt)
			{
			return null;	
			}
			else
			{
				return word;
			}
				
		}
		return word;
}
		
		
		
	
	
	@Override
	public void setMaxWrongGuesses(Integer max) {
		// TODO Auto-generated method stub

		Integer maxMistakes = new Integer(max);
		if (maxMistakes.toString() == null) {
			maxMistakes = 0;
		}
		maxMistakesInt = maxMistakes;

	}

}
