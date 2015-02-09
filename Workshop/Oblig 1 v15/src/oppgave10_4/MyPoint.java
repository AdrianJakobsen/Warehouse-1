package oppgave10_4;

public class MyPoint {
	
	private int pointX;
	private int pointY;
	
	public MyPoint(){
		this.pointX=0;
		this.pointY=0;
	}
	public MyPoint(int pointX, int pointY) {
		this.pointX=pointX;
		this.pointY=pointY;		
	}
	public int getPointX() {
		return pointX;
	}
	public int getPointY() {
		return pointY;
	}
	public double distanceFromSenter() {
		double distance = Math.sqrt(Math.pow(this.pointX, 2)+Math.pow(this.pointY, 2));
		return distance;
	}
	public double distanceFromAnotherPoint(int pointX, int pointY) {
		double distance = Math.sqrt(Math.pow(pointX-this.pointX,2)+Math.pow(pointY-this.pointY,2));
		return distance;
	}
}
