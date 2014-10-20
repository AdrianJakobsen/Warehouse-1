package objects;


public class StopWatch {
	long endTime = 0;
	long startTime = 0;

	public void reset() {
		endTime = 0;
		startTime = 0;

	}

	public double getElapsedTime() {
		double elapsedTime = endTime - startTime;	
		double elapsedTimeInSeconds = elapsedTime / 1000;
		return elapsedTimeInSeconds;
	}

	public void stop() {
		endTime = System.currentTimeMillis();


	}

	public void start() {
		startTime = System.currentTimeMillis();


	}
}
