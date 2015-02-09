package oppgave11_2_Test;

import static org.junit.Assert.*;
import oppgave11_2.Person;

import org.junit.Test;

public class TestPerson {

	@Test
	public void Test_defaultConstructor() {
		Person p1 = new Person();
		assertNotNull(p1);
	}
	@Test
	public void get_Name(){
		Person p1 = new Person();
		assertEquals("Jon", p1.getName());
	}
	@Test
	public void get_address(){
		Person p1 = new Person();
		assertEquals("Dronningens gate", p1.getAddress());
	}
	@Test
	public void get_phoneNumber(){
		Person p1 = new Person();
		assertEquals(99571396, p1.getNumber());
	}
	@Test
	public void get_email(){
		Person p1 = new Person();
		assertEquals("adrjak.aj@gmail.com", p1.getEmail());
	}
	@Test
	public void test_ParameterfilledConstructor(){
		Person p1 = new Person("Adrian","kløverengveien 5",75511411,"adrjak.aj@outlook.com");
		assertEquals("Adrian", p1.getName());
		assertEquals("kløverengveien 5", p1.getAddress());
		assertEquals(75511411, p1.getNumber());
		assertEquals("adrjak.aj@outlook.com", p1.getEmail());
	}
	@Test
	public void override_toString(){
		Person p1 = new Person();
		assertEquals("Jon\nDronningens gate\n99571396\nadrjak.aj@gmail.com",p1.toString());
	}
}
