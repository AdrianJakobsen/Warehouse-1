package oppgave10_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyPoint {

	@Test
	public void test_DefaultConstructor() {
		MyPoint point = new MyPoint();
		assertEquals(0, point.getPointX());
		assertEquals(0, point.getPointY());
	}
	@Test
	public void test_ParameterFilledConstructor(){
		MyPoint point = new MyPoint(2,5);
		assertEquals(2, point.getPointX());
		assertEquals(5, point.getPointY());
	}
	@Test
	public void test_DistanceFromSenter(){
		MyPoint point = new MyPoint(2,6);
		assertEquals(6.32455, point.distanceFromSenter(),0.00001);
	}
	@Test
	public void test_DistanceFromAnotherPoint(){
		MyPoint point = new MyPoint(2,6);
		assertEquals(2, point.distanceFromAnotherPoint(0,6),0.00001);
	}
}
