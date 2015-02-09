package oppgave11_1;

import static org.junit.Assert.*;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;

public class TestTriangle {
	

	@Test
	public void testDefaultConstructor() {
		Triangle tri = new Triangle();
		assertEquals(1.0, tri.getSide1(),0);
		assertEquals(1.0, tri.getSide2(),0);
		assertEquals(1.0, tri.getSide3(),0);
	}
	@Test
	public void testParameterFilledConstructor(){
		Triangle tri = new Triangle(2.4, 2.5, 1.9);
		assertEquals(2.4, tri.getSide1(),0);
		assertEquals(2.5, tri.getSide2(),0);
		assertEquals(1.9, tri.getSide3(),0);
	}
	@Test
	public void test_SetValueToSides(){
		Triangle tri = new Triangle();
		tri.setSide1(2.5);
		tri.setSide2(2.4);
		tri.setSide3(2.1);
		assertEquals(2.5, tri.getSide1(),0);
		assertEquals(2.4, tri.getSide2(),0);
		assertEquals(2.1, tri.getSide3(),0);
		
	}
	@Test
	public void test_InheretFromGeometricObject(){
		Triangle tri = new Triangle();
		assertTrue(tri instanceof GeomerticObject);
	}
	@Test
	public void test_GetPerimeterOf_DefaultConstructor(){
		Triangle tri = new Triangle();
		assertEquals(3, tri.getPerimeterOf(),0);
	}
	@Test
	public void test_GetAreaOf_DefaultConstructor(){
		Triangle tri = new Triangle();
		assertEquals(0.433012701, tri.getAreaOf(),0.00001);//
	}
	@Test
	public void test_ToString(){
		Triangle tri = new Triangle();
		assertEquals(tri.toString(), "Triangle: Side 1 = 1.0 Side 2 = 1.0 Side 3 = 1.0");
	}
}
