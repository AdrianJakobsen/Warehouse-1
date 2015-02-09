package ex3;

public class w {

}
// return codes:
// 1: success
// 0: letter already set
// -1: no such letter in word
private static int checkGuess(String word, String mask, char guess) {
        int index = word.indexOf(guess);
        if (index != -1) {
                int maskIndex = mask.indexOf(guess);
               
                if (maskIndex == -1)
                        return 0;
                else
                        return 1;
        } else {
                return -1;
        }
}
private int guessCheck(String word, String currentHiddenWord, char guess){
	boolean letterInWord = word.indexOf(guess) != -1;


		if (letterInWord){
			boolean letterInMask = currentHiddenWord.indexOf(guess) != -1;
			if(letterInMask){
				System.out.println("The letter " + guess + " is allredy in the word");
			}
			else{
				mask.setCharAt(currentHiddenWord.indexOf(guess), (char) word.indexOf(guess));
			}
		}
		else{
			System.out.println("The letter" + guess + " is not in the word");
			numberOfFailedGuesses++;

		}
		for (int k = word.indexOf(guess); k >= 0; k = word.indexOf(guess, k + 1)){
		    mask.setCharAt(word.indexOf(guess), guess);