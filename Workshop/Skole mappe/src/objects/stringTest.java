package objects;

public class stringTest {

	public static void main(String[] args) {
		String name = "  Pelle Parafin  ";
		int stringLength = name.length();
		
		//String[] parts = name.split(",");
		//int indexOfSpace = name.indexOf(' ');
		
		//String firstName = name.substring(0, indexOfSpace);
		//String lastName = name.substring(indexOfSpace + 1, name.length());
		//char c = name.charAt(6);
		String trimmedString = name.trim();
		System.out.println(name);
	}

}
