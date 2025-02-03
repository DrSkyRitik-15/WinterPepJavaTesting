package One;

public class typeConversion {

	String LeapYear(int num) {
		if ((num % 4 == 0 && num%100!=0)||num % 400 == 0) {
			return "Leap year";
		} else
			return "Normal Year";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			typeConversion aa=new typeConversion();
			String i=aa.LeapYear(-1600);
			String j=aa.LeapYear(1600);
			String k=aa.LeapYear(2017);
			String l=aa.LeapYear(2000);
			System.out.println("-1600 -> "+i);
			System.out.println("1600 -> "+j);
			System.out.println("2017 -> "+k);
			System.out.println("2000 -> "+l);
	}

}
