package arrays;

public class rectangle1 {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		//rect1.setHeight(-10.0);
		
		Rectangle rect2 = new Rectangle(4.0, 5.0);
		
		Rectangle rect3 = new Rectangle();
		
		System.out.println("rect1 heigth: " + rect1.getHeigth());
		System.out.println("rect1 area: " + rect1.getArea());
		System.out.println("rect1 perimeter: " + rect1.getPerimeter());
		
		System.out.println("rect2 heigth: " + rect2.getHeigth());
		System.out.println("rect2 area: " + rect2.getArea());
		System.out.println("rect2 perimeter: " + rect2.getPerimeter());
		
		System.out.println("number of rectangels: " + Rectangle.numberOfRectangelsCreated);
		
	}

}
