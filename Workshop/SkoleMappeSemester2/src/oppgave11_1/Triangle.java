package oppgave11_1;

public class Triangle extends GeomerticObject {
	private double side1;
	private double side2;
	private double side3;
	
	
	public Triangle(){
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide1(double lenght) {
		this.side1 = lenght;
	}
	public void setSide2(double lenght) {
		this.side2 = lenght;
	}
	public void setSide3(double lenght) {
		this.side3 = lenght;
	}
	public double getAreaOf() {
		// with Heron's formula
			double s = getPerimeterOf()/2;
			double area = Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
			return area;
	}
	public double getPerimeterOf() {
		return side1+side2+side3;
	}
	public String toString(){
		return "Triangle: Side 1 = " + side1 +" Side 2 = " + side2 + " Side 3 = " +side3;
	}
}
