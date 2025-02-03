package One;

public class decimal {

	static boolean check(double a,double b) {
		
		int aa=(int)(a*1000);
		int bb=(int)(b*1000);
		
		return aa==bb;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a=check(-3.1756d,-3.175d);
		boolean b=check(3.123d,3.12d);
		boolean c=check(-3.123d,3.123d);
		boolean d=check(-3.123d,-3.123d);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
