package oppgave10_9;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestCourse {

	@Test
	public void test_getCoursename() {
		Course course = new Course("Math");
		assertEquals("Math", course.getCourseName());
	}
	@Test
	public void test_addStudentAndGetNumberOfStudents_1(){
		Course course = new Course("Math");
		course.addStudent("Jim");
		assertEquals(1,course.getNumberOfStudents());
	}
	@Test
	public void test_addStudent_lookForName(){
		Course course = new Course("Math");
		course.addStudent("Jim");
		assertEquals(true, Arrays.asList(course.getStudents()).contains("Jim"));
	}
	@Test
	public void test_addStudentAndGetNumberOfStudents_4(){
		Course course = new Course("Math");
		course.addStudent("Jim");
		course.addStudent("magnus");
		course.addStudent("thomas");
		course.addStudent("Adrian");
		assertEquals(4,course.getNumberOfStudents());
	}
	@Test
	public void test_MakeNewBiggerArray(){
		Course course = new Course("Math");
		for (int i=0; i<120; i++){
			course.addStudent("knut");
		}
		assertEquals(120, course.getNumberOfStudents());
	}
	@Test
	public void test_dropStudent(){
		Course course = new Course("Math");
		course.addStudent("helge");
		course.addStudent("Jim");
		course.addStudent("thomas");
		for (int i=0; i<10; i++){
			course.addStudent("knut");
		}
		course.dropStudent("thomas");
		assertEquals(12, course.getNumberOfStudents());
	}
	@Test
	public void test_clearAllStudents(){
		Course course = new Course("Math");
		for (int i=0; i<120; i++){
			course.addStudent("knut");
		}
		course.clear();
		assertEquals(0, course.getNumberOfStudents());
		assertEquals(0, course.getStudents().length);
	}
	@Test
	public void test_courseToString(){
		Course course = new Course("Math");
		course.addStudent("helge");
		course.addStudent("Jim");
		course.addStudent("thomas");
		course.dropStudent("thomas");
		assertEquals("helge\nJim\n", course.toString());
	}
}
