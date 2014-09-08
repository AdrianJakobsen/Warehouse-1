
public class Test {
	public static void main (String[] args)
	{
		// ofte brukte primitive datatyper
		int age = 22; // int = heltall
		double height = 182.5; // double = desimaltall
		boolean isMale = true; // boolean = sant/usant
		
		// primitite datatyper som brukes til spesielle form�l
		byte enByte = 127; // lister med bytes kan f.eks. holde p� filer
		short bitInt = 32767; // en 16-bit integer, "int" er derimot 32 bit og b�r brukes i nesten alle tilfeller
		long bitInt64 = 8223372036854775807L; //  en 64-bit integer
		float enFloat = 13.37f; // et desimaltall p� 32 bit som brukes for � lagre store tall 
		char etTegn = 'a'; // holder p� ett tegn

		// string er ikke primitiv, for en string er en liste med chars
		String fullName = "Adrian Jakobsen";
		
		// under er en "char array" (array = liste) som holder p� 6 bokstaver
		// man kan aksessere hvert bokstav via firstname[0], firstname[1] osv
		// pr�v � println(firstname[5]), hva tror du kommer ut?
		// hva med println(firstname) ?
		char[] firstname = { 'A', 'd', 'r', 'i', 'a', 'n' };  
		
		String printString = "Hello there ";
		
		if (isMale)
			printString += "male";
		else
			printString += "female";
		
		printString += " human. Your name is " + fullName + ", you are " + height + "cm tall and " + age + " years old.";
		
		System.out.println(printString);
		System.out.println(firstname);
	}
}
