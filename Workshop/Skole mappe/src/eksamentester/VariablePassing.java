package eksamentester;

public class VariablePassing {

	public static void main(String[] args) {
		int x = 234;
		String s = "kjeft";
		
		x = edit(x);
		edit(s);
		System.out.println(x + " " + s);
	}
	private static int edit(int x){
		x++;
		return x;
	}
	private static void edit(String s){
		s += "?";
	}
}
