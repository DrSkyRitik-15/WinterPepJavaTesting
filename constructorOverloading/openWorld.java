package constructorOverloading;

public class openWorld {
    private String name;
    private int age;

    public openWorld() {
        System.out.println("No-arg constructor called");
    }

    public openWorld(String name) {
        this.name = name;
        System.out.println("Constructor with name parameter called");
    }

    public openWorld(int age) {
        this.age = age;
        System.out.println("Constructor with age parameter called");
    }

    public openWorld(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with both name and age parameters called");
    }

    public static void main(String[] args) {
        // Create objects using different constructors
        openWorld person1 = new openWorld();
        openWorld person2 = new openWorld("John");
        openWorld person3 = new openWorld(25);
        openWorld person4 = new openWorld("Jane", 30);
    }
}