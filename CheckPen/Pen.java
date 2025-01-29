package CheckPen;

public class Pen {
    private static int penCount = 0;
    private static int pensSold = 0;

    public Pen() {
        penCount++;
    }

    public static void sellPen() {
        if (penCount > 0) {
            penCount--;
            pensSold++;
        } else {
            System.out.println("No pens available to sell.");
        }
    }

    public static int getPenCount() {
        return penCount;
    }

    public static int getPensSold() {
        return pensSold;
    }
    
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        System.out.println("Total pens: " + Pen.getPenCount());
        Pen.sellPen();
        System.out.println("Pens sold: " + Pen.getPensSold());
        System.out.println("Total pens: " + Pen.getPenCount());
    }
}
