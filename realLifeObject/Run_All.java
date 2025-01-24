package realLifeObject;

public class Run_All {

	public static void main(String[] args) {
		Cat obj=new Cat();
		Lion obj2=new Lion();
//		Dog obj3=new Dog();
		System.out.println("The Cat================");
		obj.All("Mona", "Rajeshthan", 2.6f, "White");
		System.out.println("The Lion ==============");
		obj2.All("JeemLion", "Gujarat", 1000.6f, "OrangeMix");
		System.out.println("The Dog=================");
//		obj3.All("Seru", "up", 24.6f, "Red");
		Dog obj3=new Dog("Seru", "up", 24.6f, "Red");   // constructor

	}

}
