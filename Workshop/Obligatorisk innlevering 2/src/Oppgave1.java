
public class Oppgave1 {

	public static void main(String[] args) {
		int[] arr ={1,2,3,4,5,6,7,8,0,0};
		System.out.println("Forskjell st�rste/minste = " + arrayInfo(arr,8,1));
		System.out.println("Sum = " + arrayInfo(arr,8,2));
		System.out.println("Snitt = " + arrayInfo(arr,8,3));

	}
	public static int arrayInfo(int [] array, int numberOfElements, int answerType){
		int diffrence=0;
		int sum=0;
		int snitt=0;
		int smallest = array[0];
		int largetst = array[0];
		switch(answerType){

		case 1: 
			for(int i=0; i< array.length; i++){
				if(array[i] > largetst)
					largetst = array[i];
				else if (array[i] < smallest)
					smallest = array[i];
				diffrence = largetst - smallest;}
			return diffrence;

		case 2: 
			for (int i = 0; i < array.length; i++) {
				sum += array[i];}
			return sum;

		case 3:
			int sum1 = 0;
			for (int i = 0; i < array.length; i++) {
				sum1 += array[i];
				snitt = sum1/numberOfElements;}
			return snitt;

		default: 
			int error =518181518;
			return error;
		}

	}
}