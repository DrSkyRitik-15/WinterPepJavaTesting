package One;

public class dogbarking {
	static String shouldWakeUp(boolean barking, int time) {
		if (time < 0)
			return "Not time";
		if ((barking) && time < 8 || (time > 22 && time <= 23)) {
			return "Wakeup!!!!";
		} else {
			return "Sleep";
		}
	}

	public static void main(String[] args) {
		//String i = shouldWakeUp(true, 1);

		//String j = shouldWakeUp(false, 2);
		
		String k = shouldWakeUp(true, 0);
		
		//String l = shouldWakeUp(true, -1);
//		System.out.println(i);
//		System.out.println(j);
		System.out.println(k);
//		System.out.println(l);
	}
}
