import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	public static void main (String[] args)  {
	String[] words = {"jazz","bodywax","past","future","rhythm","diphthong","zugzwang","fountain","aesthetic","joy","ink","cat","alphabet","eight","omen","operator","five","zombie","letters","fluffy"};
	String gameWord = words[(int)(Math.random() * words.length)];
	char[] gameLetters = gameWord.toCharArray();
	char[] guessLetters = new char[gameLetters.length];
	for(int i = 0; i < guessLetters.length; i++){
		guessLetters[i] = '_';
	}
	int mistakes = 0;
	int guessed = 0;
	while(mistakes < 10 && guessed != guessLetters.length){
		Scanner scan = new Scanner(System.in);
		System.out.println("Right now you have made a total of " + mistakes + " mistakes. Enter the letter you would like to guess:");
		for(int i = 0; i < guessLetters.length; i++){
			System.out.print(guessLetters[i] + " ");
		}
		char letter = scan.next().charAt(0);
		int changes = 0;
		for(int j = 0; j < guessLetters.length; j++){
			if(gameLetters[j] == letter){
				changes++;
				guessed++;
				guessLetters[j] = letter;
			}
		}
		if(changes == 0){
			mistakes++;
		}
	}
	if(mistakes == 10){
		System.out.println("GG, You lost. The word was " + gameWord + "!");
	}
	else
		System.out.println("GG, You won! The word was " + gameWord + ".");
		
	}
}