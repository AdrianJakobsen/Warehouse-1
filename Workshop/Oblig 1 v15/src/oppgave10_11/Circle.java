package oppgave10_11;

public class Circle {
	
	private double pointX;
	private double pointY;
	private double radius;

	public Circle(){
		this.pointX = 0;
		this.pointY = 0;
		this.radius = 1;
	}

	public Circle(double pointX, double pointY, double radius) {
		this.pointX=pointX;
		this.pointY=pointY;
		this.radius=radius;
	}

	public double getPointX() {
		return this.pointX;
	}

	public double getPointY() {
		return this.pointY;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		double area = (Math.PI*Math.pow(this.radius, 2));
		return area;
	}

	public double getPerimeter() {
		double perimeter = (Math.PI*2*this.radius);
		return perimeter;
	}

	public boolean contains(double pointX, double pointY) {
		double  distance =  Math.sqrt(Math.pow(pointX-this.pointX,2)+Math.pow(pointY-this.pointY,2));
		boolean pointInside = distance<this.radius;
		return pointInside;
	}

	public boolean contains(Circle circle2) {
		double distance = Math.sqrt(Math.pow(circle2.getPointX()-this.pointX,2)+Math.pow(circle2.getPointY()-this.pointY,2));
		boolean circleInside = radius>=(circle2.getRadius()+distance);
		return circleInside;
	}

	public boolean overlap(Circle circle2) {
		double distance = Math.sqrt(Math.pow(circle2.getPointX()-this.pointX,2)+Math.pow(circle2.getPointY()-this.pointY,2));
		boolean circleIntersect = distance < this.radius+circle2.getRadius();
		return circleIntersect;
	}
	
}
