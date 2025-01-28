package AccesModifier;

public class Man {

    protected String name;
    protected int age;

    protected Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
