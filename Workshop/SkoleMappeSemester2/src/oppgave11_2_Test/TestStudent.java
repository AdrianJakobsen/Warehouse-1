package oppgave11_2_Test;

import static org.junit.Assert.*;
import oppgave11_2.Student;

import org.junit.Test;

public class TestStudent {

	@Test
	public void test_defaultConstructor() {
		Student stud1 = new Student();
		assertNotNull(stud1);
	}
	@Test
	public void check_AllFinalStatments(){
		Student stud1 = new Student();
		assertEquals(1, stud1.FRESHMAN);
		assertEquals(2, stud1.SOPHOMORE);
		assertEquals(3, stud1.JUNIOR);
		assertEquals(4, stud1.SENIOR);
	}
	@Test
	public void get_Status(){
		Student stud1 = new Student();
		assertEquals(0, stud1.getStatus());
	}
	@Test
	public void test_constructorThatSetsStatus(){
		Student stud1 = new Student(3);
		assertEquals(3, stud1.getStatus());
	}
	@Test
	public void override_toString(){
		Student stud1 = new Student(3);
		assertEquals("Junior", stud1.toString());
	}
	@Test
	public void inheritance_checkIfMetodsFromPersonWorks(){
		Student stud1 = new Student();
		assertEquals("Jon", stud1.getName());
		assertEquals("adrjak.aj@gmail.com", stud1.getEmail());
	}
}