package arrays;

public class Rectangle {

	private double heigth = 1.0;
	private double width = 1.0;
	
	static int numberOfRectangelsCreated = 0;

	public Rectangle(){
		numberOfRectangelsCreated++;
	}

	public Rectangle(double heigth, double width){
		this.heigth = heigth;
		this.width = width;
		numberOfRectangelsCreated++;
	}

	public double getArea(){
		return heigth*width;
	}

	public double getPerimeter() {
		return heigth * 2 + width *2;
	}
	public double getHeigth(){
		return heigth;
	}
	public double getWidth(){
		return width;
	}

	public void setHeight(double newHeigth) {
		if (newHeigth > 0){
			heigth = newHeigth;
		}
	}
}
