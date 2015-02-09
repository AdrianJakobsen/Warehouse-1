package objects;

import java.util.Scanner;

public class Student {
	
		int elements;
		int indexOfSpace;
		int indexOfComma;
		elements = 0;
		Scanner scan = new Scanner(System.in);
		//userInput = scan.next();
		//indexOfSpace = userInput.indexOf(' ');
		//indexOfComma = userInput.indexOf(',');
	
		public Student() {
		String firstName;
		String lastName;
		String age;
		String sex;
	}

	boolean checkIfAddNewStudent(){
		return ( userInput.startsWith("add")==true);
	}
	public void addStudent(){
		StudentTeacher supervisor = new StudentTeacher();
		
		if(checkIfAddNewStudent()==true){
			supervisor.listOfStudents(elements)[elements]= userInput;
			elements++;
		}
		System.out.println("Invalid commando, student was not added.");
	}
	/*private findNameAgeSex(){	
		 firstName = userInput.substring(4, indexOfSpace);
		 lastName = userInput.substring(indexOfSpace + 1, indexOfComma);
		 age = userInput.substring(indexOfComma, indexOfComma);
		 sex = userInput.substring((indexOfComma+indexOfComma), userInput.length());
	}*/
	private static void getInputFromUser (){
		Scanner scan = new Scanner(System.in);
		while(true){
		String userInput = scan.next();
		}
	}
}
