
public class prob2 {
	public static void main(String[] args) {
		fibonacci();
		//skiper tallet en i fibonacci og starter på 2;
	}
	private static void fibonacci(){
		long an1=1l;
		long an2=1l;
		long an= 0;
		long temp = 0;
		for(int i=0; i<100; i++){
			 an = an1+an2;
			an2=an1;
			an1=an;
			if(an%2==0 && an1<4000000 && an2<4000000){
				 temp = temp + an;
				
			}
		}
		System.out.println(temp); 
	}
}
