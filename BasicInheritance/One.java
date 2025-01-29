package BasicInheritance;

 class ZEN {
    public void display() {
        System.out.println("This is class ZEN");
    }
}

class Three extends Two {
    public void display() {
        super.display();
        System.out.println("This is class Three");
    }
}

class Two extends ZEN {
    public void display() {
        super.display();
        System.out.println("This is class Two");
    }
 
}

public class One{
    public static void main(String[] args) {
        Three obj = new Three();
        obj.display();
    }
}

