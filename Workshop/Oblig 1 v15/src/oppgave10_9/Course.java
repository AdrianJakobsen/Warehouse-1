package oppgave10_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Course {
	private String courseName;
	private String[] students = new String[0];
	private int numberOfStudents;

	public Course(String courseName){
		this.courseName=courseName;
	}
	public void addStudent(String student){
		if(numberOfStudents<students.length){
			students[numberOfStudents] =student;
			numberOfStudents++;
		}else{
			String[] temp = new String[numberOfStudents+1];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
			students[numberOfStudents] =student;
			numberOfStudents++;
		}
	}
	public String[] getStudents(){
		return students;
	}
	public int getNumberOfStudents(){
		return numberOfStudents;
	}
	public String getCourseName(){
		return courseName;
	}
	public void dropStudent(String student){
		if(Arrays.asList(students).contains(student)){
			// fant framgangsmåten på internett, bruker convertering rundt arraylist for å kunne endre på String[] størrelsen til slutt
			ArrayList<String> temp = new ArrayList<String>();
			Collections.addAll(temp,students);
			temp.remove(Arrays.asList(students).indexOf(student));
			students = temp.toArray(new String[student.length()]);
			numberOfStudents--;
		}else{
			System.out.println("The Student turned into a pot and fell from the sky.....(get it!!!)");
		}
	}
	public void clear() {
		students = new String[0];
		numberOfStudents=0;
	}
	public String toString(){
		String temp = "";
		for(int i=0; i<students.length;i++){
			if(students[i]==null){
			}else{
				temp = temp + students[i] + "\n";
			}
		}
		return temp;
	}
}