package AccesModifier;

public class Laptop {
    int price;
    String color;

    Laptop(int p,String f)
    {
        this.color=f;
        this.price=p;
    }

    void display(){
        System.out.println(color +"  "+ price);
    }
}
