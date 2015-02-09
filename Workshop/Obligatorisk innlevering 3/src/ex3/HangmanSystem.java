package ex3;

import java.util.Random;
import java.util.Scanner;

public class HangmanSystem {

	Random rand = new Random();
	public final String[] words = {"oslo", "program", "geoforce", "soccer", "popcorn", "oblig"};
	private String word;
	private Scanner scan;
	private char guess;
	private StringBuilder mask;
	public int numberOfFailedGuesses;


	public HangmanSystem(){
		setWord();
		numberOfFailedGuesses = 0;
	}

	private String setWord(){
		word = words[rand.nextInt(6)];
		return word;
	}

	public String getWord(){
		return word;
	}
	public String hiddenWordClean(){

		mask = new StringBuilder(word);
		for(int i = 0; i<word.length(); i++){
			mask.setCharAt(i, '*');
		}
		return mask.toString();
	}
	public String getCurrentHiddenWord(){
		return mask.toString();
	}
	private int guessCheck(String word, String currentHiddenWord, char guess){
		boolean letterInWord = word.indexOf(guess) != -1;
		if (letterInWord){
			boolean letterInMask = currentHiddenWord.indexOf(guess) != -1;
			if(letterInMask){
				return 0;
			}
			else{
				return 1;
			}
		}
		else{
			return -1;
		}
	}
	public void resultGuessCheck(){
		if(guessCheck(word, getCurrentHiddenWord(), guess)==0){
			System.out.println("The letter " + guess + " is allredy in the word");
		}
		else if(guessCheck(word, getCurrentHiddenWord(), guess)==1){
			for(int k=0; k < word.length(); k++){
				if(word.charAt(k) == guess){
					mask.setCharAt(k, guess);
				}
			}
		}
		else if(guessCheck(word, getCurrentHiddenWord(), guess)== -1){
			System.out.println("The letter " + guess + " is not in the word");
			numberOfFailedGuesses++;
		}
	}

	public boolean checkWin() {
		if(mask.toString().equals(word)){
			return true;
		}
		return false;

	}
	public char guessLetter(){
		scan = new Scanner(System.in);
		this.guess = scan.next().charAt(0);
		return guess;
	}
}
