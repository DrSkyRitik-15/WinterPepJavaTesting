package One;
class Add{
	
	int Adding(int a,int b)								//<---------------
	{														//			|      method overloading
															//			|
		return a+b;											//			|
	}													//<-----------------				
	float Adding(float a,float b)
	{
		
		return a+b;
	}
	int Adding(int a,int b,int c)
	{
		
		return a+b+c;
	}
}
public class AddTwoDigitNumber {

	public static void main(String[] args) {
		Add obj=new Add();
		
		int a = obj.Adding(5, 5);
		int b = obj.Adding(2, 3);
		int c = obj.Adding(0, 7);
		System.out.println(a+" "+b+" "+c);

	}

}
