package oblig1;

public class Oppgave3 {

	private static class Point {
		public double x, y;
		
		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		public static double GetDistance(Point a, Point b) {
			return Math.sqrt(Math.pow(a.x-b.x, 2) + Math.pow(a.y-b.y, 2));
		}
	}
	
	public static void main(String[] args) {
		Point i = new Point(3, 17);
		Point j = new Point(8,10);
		
		System.out.println(Point.GetDistance(i, j));
		
		Point k = new Point(-33, 49);
		Point h = new Point(-9,-15);
		
		System.out.println(Point.GetDistance(k, h));
	}

}
