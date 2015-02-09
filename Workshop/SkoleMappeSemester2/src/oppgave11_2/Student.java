package oppgave11_2;

public class Student extends Person {

	public static final int FRESHMAN = 1;
	public static final int SOPHOMORE = 2;
	public static final int JUNIOR = 3;
	public static final int SENIOR = 4;
	private int status;
	
	public Student(){
	}
	
	public Student(int status) {
		this.status = status;
	}

	public int getStatus() {
		return status;
	}
	@Override
	public String toString(){
		String output;
		switch(this.status){
		case 1: output = "Freshman";
				break;
		case 2: output = "Sophomore";
				break;
		case 3: output = "Junior";
				break;
		case 4: output = "Senior";
				break;
		default: output ="invalid status, that or you are repiting a year";
				break;
		} 	
		return output;
	}	
}