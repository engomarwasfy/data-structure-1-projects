package eg.edu.alexu.csd.datastructure.hangman.cs46;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main {

	static int x;
	static String show;
	static char c;
	static Integer max = new Integer(0);
	static Character ch = new Character('a');
	static String secretWord;
	static String[] words = new String[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHangMan tester = new MyHangMan();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 4; i++) {
			System.out.println("please enter word " + (i+1));
			words[i] = sc.next();
		}
		tester.setDictionary(words);
		tester.selectRandomSecretWord();
		secretWord = tester.word;
		System.out.println("please enter maxnumber of mistakes");
		max= sc.nextInt();
		tester.setMaxWrongGuesses(max);
		while (true) {
			System.out.println("please enter char");
			c = sc.next().charAt(0);
			ch=c;
			show = tester.guess(ch);
			if (show == null) {
				System.out.println("Lose");
				break;
			} else if (!show.contains("-")) {
				System.out.println("Win");
				System.out.println(show);
				break;
			}
			System.out.println(show);

		}
		sc.close();
	}
}
