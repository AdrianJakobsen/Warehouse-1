import java.util.Random;


public class MyntKrone1mill {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int mynt = 0;
		int krone = 0;

		int count = 0;
		while(count !=1000000){
			int coinFlip = rand.nextInt(2);
			if (coinFlip==0){
				mynt++;
				count++;
			}
			else{
				krone++;
				count++;
			}
		}	
		System.out.println("Mynt: " + mynt +"\nKrone: " + krone);
	}

}


