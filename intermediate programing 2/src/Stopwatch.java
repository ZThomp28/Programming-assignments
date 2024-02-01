
public class Stopwatch {
	private long startTime; 
	private long endTime;	

	
	Stopwatch() {
		startTime = System.currentTimeMillis();
	}

	public void start() {
		startTime = System.currentTimeMillis();
	} 

	public void stop() {
		endTime = System.currentTimeMillis();
	}

	public long getElapsedTime() {
		return getEndTime() - getStratTime();
	}

	public long getStratTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}
}
