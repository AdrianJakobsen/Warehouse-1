
public class prob1 {

	public static void main(String[] args) {
		multiple();


	}
	public static void multiple(){
		int sum = 0;
		for(int i=1; i<1000; i++){
			if(i%3==0 || i%5==0){
				sum +=i;
			}
		}
		System.out.println(sum);
	}
}

