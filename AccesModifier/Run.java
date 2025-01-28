package AccesModifier;

public class Run {
    public static void main(String[] args) {

        System.out.println("=================" );
        Fan obj = new Fan(50, "Blue");
        obj.getSpeed();


        System.out.println("=================" );
        // Create objects using different constructors
        Man person1 = new Man("John", 25);
        person1.display();

        System.out.println("=================" );

        Laptop ll=new Laptop(4500,"DELL");
        ll.display();


        System.out.println("=================" );
        ProtectedExtendCheck  kk=new ProtectedExtendCheck("DELL in protected",50000);
    }

}
