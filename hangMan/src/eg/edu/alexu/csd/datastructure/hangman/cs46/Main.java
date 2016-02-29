package eg.edu.alexu.csd.datastructure.hangman.cs46;



import java.util.Scanner;

import eg.edu.alexu.csd.datastructure.hangman.IHangman;

public class Main {

	static String[] directionary = new String[] { "BELGIUM", "BURUNDI", "COLOMBIA", "EGYPT", "KAZAKHSTAN", "MAURITANIA", "SINGAPORE", "UZBEKISTAN" }; // this should be read from file, instead of having them hard-coded
	
	public static void main(String[] args) {
		MyHangMan hangman = new MyHangMan() ;   // Here you will create an object of your class
		hangman.setDictionary(directionary);
		hangman.setMaxWrongGuesses(5);
		String secret = hangman.selectRandomSecretWord();
		Scanner input = new Scanner(System.in);  // Get user input
		Character guess = null;
		do{
			String result = hangman.guess(guess);
			if(result==null){
				System.out.println("Fail! correct answer = '" + secret + "'"); // fail
				return;
			}
			System.out.println(result);
			if(!result.contains("-")){
				System.out.println("Well Done!");  // win
				return;
			}
			guess = input.next().toUpperCase().charAt(0);
		}while(true);
	}
}