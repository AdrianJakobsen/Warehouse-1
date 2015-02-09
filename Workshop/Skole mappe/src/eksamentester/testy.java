package eksamentester;

public class testy {

	public static void main(String[] args) {
		String s = "45";
		System.out.println(GetMeAnInt(s));
	}
	public static int GetMeAnInt(String seed){
		int num = Integer.parseInt(seed);
		return num;
		
	}

}
