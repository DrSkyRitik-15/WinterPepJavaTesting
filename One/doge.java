package One;

class doge {
	 String name;
	 String bread;
	 float weight;
	 String color;
	
	
	 void bark() {
		System.out.println("A dog is barking");
		}
	 void eat() {
		System.out.println("A dog is eating");
		}
	 void walk() {
		System.out.println("A dog is walking");
		}
	 void Sleep() {
		System.out.println("A dog is Sleeping");
		}
	void All(String a,String b,float c,String d)
	{
		this.name=a;
		this.bread=b;
		this.weight=c;
		this.color=a;
		System.out.println("Name -> "+name);
		System.out.println("Bread -> "+bread);
		System.out.println("Weight -> "+weight);
		System.out.println("Color -> "+color);
		
		Sleep();
		walk();
		bark();
		eat();
		
		
	}
}