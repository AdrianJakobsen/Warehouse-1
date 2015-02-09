package eksamentester;
public class Person{
	private String navn;
	String s1 = "donald" + "123";
	public Person(String etNavn){
		navn = etNavn;
	}
	public void nyttNavn(String etNavn){
		navn = etNavn;
	}
	public String hentNavn(){
		return navn;
	}

	public static void main(String[] args){
		Person p1 = new Person("Sofus");
		Person p2 = new Person("Pelle");
		p1 = p2;
		p2.nyttNavn("Roger");
		System.out.println(p1.hentNavn());
		System.out.println(p2.hentNavn());
	}
}