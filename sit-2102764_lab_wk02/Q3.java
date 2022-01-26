public class Q3 {
	public static void main(String[] args) {
		long totalMilliseconds, totalSeconds, totalMinutes, totalHours;
		long currentSeconds, currentMinutes, currentHours;
		String currentTime;

		totalMilliseconds = System.currentTimeMillis();
		totalSeconds = totalMilliseconds/1000;
		currentSeconds = totalSeconds%60;
		totalMinutes = totalSeconds/60;
		currentMinutes = totalMinutes%60;
		totalHours = totalMinutes/60;
		currentHours = totalHours%24;

		currentTime = currentHours + ":" + currentMinutes + ":" + currentSeconds;

		System.out.println("Current time is " + currentTime + " GMT");
	}
}
