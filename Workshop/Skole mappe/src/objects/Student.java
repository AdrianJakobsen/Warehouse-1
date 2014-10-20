package objects;

public class Student {
	private String firstName;
	private String lastName;
	private String age;
	private String sex;

	
	public  Student(String firstName, String lastName, String age, String sex) {
		String studentInfo = firstName + lastName + age + sex;
		System.out.println(studentInfo);
	}
	
		
}
