package oppgave12_11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class removeWord {
	private File myFile;
	private Scanner input;

	public removeWord() throws IOException{
		myFile = new File("testFile.txt");
		input = new Scanner(myFile);
	}

	public void removeFromFile(){

	}
	public boolean checkForAWord(String word){
		while(input.hasNext()){
			if(input.next() == word){
				return true;
			}
		}
		return false;
	}
}
