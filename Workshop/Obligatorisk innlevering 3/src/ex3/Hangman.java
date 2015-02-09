package ex3;

import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		HangmanSystem system;
		Scanner scan = new Scanner(System.in);
		boolean exit = false;
		boolean gameOver = false;
		while(exit!=true){
			system = new HangmanSystem();
			system.hiddenWordClean();
			while(gameOver!=true){
				System.out.println("(Guess) Enter a letter in a word: " + system.getCurrentHiddenWord());
				system.guessLetter();
				system.resultGuessCheck();
				System.out.print("Guesses so far: ");
				if(system.checkWin() == true){
					gameOver= true;
					System.out.println("The word is " + system.getWord() + ". You missed " + system.numberOfFailedGuesses + " times.");
				}
			}
			System.out.println("Do you wish to try another word? (y/n)");
			switch(scan.next().charAt(0)){
			case 'y':
				gameOver = false;
				break;
			case 'n':
				exit = true;
				break;
			default:
				System.out.println("Wrong input.");
				break;
			}
		}
		scan.close();
	}
}
