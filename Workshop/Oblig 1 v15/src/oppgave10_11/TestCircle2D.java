package oppgave10_11;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCircle2D {

	@Test
	public void test_defaultConstructor() {
		Circle circle = new Circle();
		assertEquals(0,circle.getPointX(),0);
		assertEquals(0,circle.getPointY(),0);
		assertEquals(1,circle.getRadius(),0);
	}
	@Test
	public void test_getPointX(){
		Circle circle = new Circle();
		assertEquals(0,circle.getPointX(),0);
	}
	@Test 
	public void test_getPointY(){
		Circle circle = new Circle();
		assertEquals(0,circle.getPointY(),0);
	}
	@Test
	public void test_getRadius(){
		Circle circle = new Circle();
		assertEquals(1,circle.getRadius(),0);
	}
	@Test
	public void test_ParameterFilledConstructor(){
		Circle circle = new Circle(2,4,1);
		assertEquals(2,circle.getPointX(),0);
		assertEquals(4,circle.getPointY(),0);
		assertEquals(1,circle.getRadius(),0);	
	}
	@Test
	public void test_getArea(){
		Circle circle = new Circle(0,0,2);
		assertEquals(12.5664,circle.getArea(),0.0001);
	}
	@Test
	public void test_getPerimeter(){
		Circle circle = new Circle(0,0,2.5);
		assertEquals(15.7079 ,circle.getPerimeter(),0.0001);
	}
	@Test
	public void test_IfAPointIsInACircle(){
		Circle circle = new Circle(0,0,2.5);
		assertTrue(circle.contains(1.3, 2.1));
	}
	@Test
	public void test_IfACircleIsInsideAnotherCircle(){
		Circle circle1 = new Circle(0,0,5);
		Circle circle2 = new Circle(3,1,1);
		assertTrue(circle1.contains(circle2));
	}
	@Test
	public void test_ifTwoCirclesOverlaps(){
		Circle circle1 = new Circle(0,0,5);
		Circle circle2 = new Circle(3,1,1);
		assertTrue(circle1.overlap(circle2));
	}
}
